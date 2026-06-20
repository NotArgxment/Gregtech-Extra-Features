package com.argxment.extraadditions.init.utils.client;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class GradientPreview {

    private static final int LV  = 0xFFAAAAAA; // Gray
    private static final int MV  = 0xFF55FFFF; // Aqua
    private static final int HV  = 0xFFFFAA00; // Gold
    private static final int EV  = 0xFFAA00AA; // Dark Purple
    private static final int IV  = 0xFF5555FF; // Blue
    private static final int LuV = 0xFFFF55FF; // Light Purple
    private static final int ZPM = 0xFFFF5555; // Red
    private static final int UV  = 0xFF00AAAA; // Dark Aqua

    private static final int WHITE = 0xFFFFFFFF;

    private static final double SPEED_SLOW = 0.1;

    private static final long[] tick = {0};

    static int blend(int c1, int c2, float ratio) {
        ratio = Math.max(0, Math.min(1, ratio));
        float iRatio = 1f - ratio;
        int a1 = (c1 >> 24 & 0xff), r1 = (c1 >> 16 & 0xff), g1 = (c1 >> 8 & 0xff), b1 = (c1 & 0xff);
        int a2 = (c2 >> 24 & 0xff), r2 = (c2 >> 16 & 0xff), g2 = (c2 >> 8 & 0xff), b2 = (c2 & 0xff);
        return (int) (a1 * iRatio + a2 * ratio) << 24 | (int) (r1 * iRatio + r2 * ratio) << 16
                | (int) (g1 * iRatio + g2 * ratio) << 8 | (int) (b1 * iRatio + b2 * ratio);
    }

    static int movingGradient(double speed, int colorA, int colorB) {
        float t = (float) (Math.sin(tick[0] * speed) * 0.5 + 0.5);
        return blend(colorA, colorB, t) | 0xFF000000; // forzamos alpha opaco para dibujar
    }

    public static void main(String[] args) {
        // mismo orden/nombres que EATooltipStyles.TIER_GRADIENTS
        Map<String, Integer> tiers = new LinkedHashMap<>();
        tiers.put("LV", LV);
        tiers.put("MV", MV);
        tiers.put("HV", HV);
        tiers.put("EV", EV);
        tiers.put("IV", IV);
        tiers.put("LuV", LuV);
        tiers.put("ZPM", ZPM);
        tiers.put("UV", UV);

        JPanel grid = new JPanel(new GridLayout(tiers.size(), 1, 0, 4));

        for (Map.Entry<String, Integer> entry : tiers.entrySet()) {
            String label = entry.getKey();
            int colorA = entry.getValue();

            JPanel row = new JPanel(new BorderLayout(8, 0));
            JLabel name = new JLabel(label);
            name.setPreferredSize(new Dimension(50, 30));

            JPanel swatch = new JPanel() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int color = movingGradient(SPEED_SLOW, colorA, WHITE);
                    g.setColor(new Color(color, true));
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            };

            row.add(name, BorderLayout.WEST);
            row.add(swatch, BorderLayout.CENTER);
            grid.add(row);
        }

        JFrame frame = new JFrame("EATooltipStyles - Tier Gradient Preview");
        frame.add(grid);
        frame.setSize(420, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        new Timer(50, e -> {
            tick[0]++;
            grid.repaint();
        }).start();
    }
}