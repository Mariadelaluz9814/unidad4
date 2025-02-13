import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import static LibreriaMatematicas.Matematicas.*;

public class calculadora extends JFrame {
    private JPanel  panelCalculadora;
    private JLabel  lbNumero;
    private JButton raizButton;
    private JButton nButton;
    private JButton xButton;
    private JButton senXButton;
    private JButton cosXButton;
    private JButton tanXButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton PotenciaButton1;
    private JButton a0Button;
    private JButton puntobutton18;
    private JButton limpiarButton;
    private JPanel  panelInstrucciones;
    private JLabel  lbInstrucciones;
    private JLabel  lbPasos1;
    private JLabel  lbPaso2;
    private JLabel  lbPaso3;
    private JLabel  lbPaso4;
    private JButton igualbutton1;
    private JLabel  lbPasosFinal;
    private JLabel  lbNota;
    private JLabel  lbNotaFinal;
    private JButton menosbutton1;
    private JButton regresarInicioButton;

    public calculadora() {
        $$$setupUI$$$();
        $$$getRootComponent$$$();
        metodoActionListener();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(panelCalculadora);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        calculadora ventana = new calculadora();
        ventana.setVisible(true);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelCalculadora = new JPanel();
        panelCalculadora.setLayout(new GridLayoutManager(9, 3, new Insets(0, 0, 0, 0), -1, -1));
        panelCalculadora.setBackground(new Color(-204877));
        raizButton = new JButton();
        raizButton.setBackground(new Color(-4247217));
        Font raizButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, raizButton.getFont());
        if (raizButtonFont != null) raizButton.setFont(raizButtonFont);
        raizButton.setText("Raiz");
        panelCalculadora.add(raizButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nButton = new JButton();
        nButton.setBackground(new Color(-11045953));
        Font nButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, nButton.getFont());
        if (nButtonFont != null) nButton.setFont(nButtonFont);
        nButton.setText("n!");
        panelCalculadora.add(nButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        xButton = new JButton();
        xButton.setBackground(new Color(-7422098));
        Font xButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, xButton.getFont());
        if (xButtonFont != null) xButton.setFont(xButtonFont);
        xButton.setText("|x|");
        panelCalculadora.add(xButton, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbNumero = new JLabel();
        lbNumero.setBackground(new Color(-1115649));
        lbNumero.setEnabled(false);
        Font lbNumeroFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 24, lbNumero.getFont());
        if (lbNumeroFont != null) lbNumero.setFont(lbNumeroFont);
        lbNumero.setForeground(new Color(-16777216));
        lbNumero.setText("");
        panelCalculadora.add(lbNumero, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        senXButton = new JButton();
        senXButton.setBackground(new Color(-4224726));
        Font senXButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, senXButton.getFont());
        if (senXButtonFont != null) senXButton.setFont(senXButtonFont);
        senXButton.setText("Sen(x)");
        panelCalculadora.add(senXButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cosXButton = new JButton();
        cosXButton.setBackground(new Color(-13779079));
        Font cosXButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, cosXButton.getFont());
        if (cosXButtonFont != null) cosXButton.setFont(cosXButtonFont);
        cosXButton.setText("Cos(x)");
        panelCalculadora.add(cosXButton, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tanXButton = new JButton();
        tanXButton.setBackground(new Color(-16138561));
        Font tanXButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, tanXButton.getFont());
        if (tanXButtonFont != null) tanXButton.setFont(tanXButtonFont);
        tanXButton.setText("Tan(x)");
        panelCalculadora.add(tanXButton, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a9Button = new JButton();
        a9Button.setBackground(new Color(-16748097));
        Font a9ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a9Button.getFont());
        if (a9ButtonFont != null) a9Button.setFont(a9ButtonFont);
        a9Button.setText("9");
        panelCalculadora.add(a9Button, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a8Button = new JButton();
        a8Button.setBackground(new Color(-4234496));
        Font a8ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a8Button.getFont());
        if (a8ButtonFont != null) a8Button.setFont(a8ButtonFont);
        a8Button.setText("8");
        panelCalculadora.add(a8Button, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a7Button = new JButton();
        a7Button.setBackground(new Color(-4254541));
        Font a7ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a7Button.getFont());
        if (a7ButtonFont != null) a7Button.setFont(a7ButtonFont);
        a7Button.setText("7");
        panelCalculadora.add(a7Button, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a6Button = new JButton();
        a6Button.setBackground(new Color(-4236612));
        Font a6ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a6Button.getFont());
        if (a6ButtonFont != null) a6Button.setFont(a6ButtonFont);
        a6Button.setText("6");
        panelCalculadora.add(a6Button, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a5Button = new JButton();
        a5Button.setBackground(new Color(-8144449));
        Font a5ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a5Button.getFont());
        if (a5ButtonFont != null) a5Button.setFont(a5ButtonFont);
        a5Button.setText("5");
        panelCalculadora.add(a5Button, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a4Button = new JButton();
        a4Button.setBackground(new Color(-8559681));
        Font a4ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a4Button.getFont());
        if (a4ButtonFont != null) a4Button.setFont(a4ButtonFont);
        a4Button.setText("4");
        panelCalculadora.add(a4Button, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a3Button = new JButton();
        a3Button.setBackground(new Color(-4231371));
        Font a3ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a3Button.getFont());
        if (a3ButtonFont != null) a3Button.setFont(a3ButtonFont);
        a3Button.setText("3");
        panelCalculadora.add(a3Button, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a2Button = new JButton();
        a2Button.setBackground(new Color(-7126337));
        Font a2ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a2Button.getFont());
        if (a2ButtonFont != null) a2Button.setFont(a2ButtonFont);
        a2Button.setText("2");
        panelCalculadora.add(a2Button, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a1Button = new JButton();
        a1Button.setBackground(new Color(-4251074));
        Font a1ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a1Button.getFont());
        if (a1ButtonFont != null) a1Button.setFont(a1ButtonFont);
        a1Button.setText("1");
        panelCalculadora.add(a1Button, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        PotenciaButton1 = new JButton();
        PotenciaButton1.setBackground(new Color(-13686337));
        Font PotenciaButton1Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, PotenciaButton1.getFont());
        if (PotenciaButton1Font != null) PotenciaButton1.setFont(PotenciaButton1Font);
        PotenciaButton1.setText("^");
        panelCalculadora.add(PotenciaButton1, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a0Button = new JButton();
        a0Button.setBackground(new Color(-4251074));
        Font a0ButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, a0Button.getFont());
        if (a0ButtonFont != null) a0Button.setFont(a0ButtonFont);
        a0Button.setText("0");
        panelCalculadora.add(a0Button, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        puntobutton18 = new JButton();
        puntobutton18.setBackground(new Color(-16138561));
        Font puntobutton18Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, puntobutton18.getFont());
        if (puntobutton18Font != null) puntobutton18.setFont(puntobutton18Font);
        puntobutton18.setText(".");
        panelCalculadora.add(puntobutton18, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        limpiarButton = new JButton();
        limpiarButton.setBackground(new Color(-8231745));
        Font limpiarButtonFont = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, limpiarButton.getFont());
        if (limpiarButtonFont != null) limpiarButton.setFont(limpiarButtonFont);
        limpiarButton.setText("Limpiar");
        panelCalculadora.add(limpiarButton, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panelInstrucciones = new JPanel();
        panelInstrucciones.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        panelInstrucciones.setBackground(new Color(-533585));
        panelCalculadora.add(panelInstrucciones, new GridConstraints(8, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        lbInstrucciones = new JLabel();
        lbInstrucciones.setBackground(new Color(-533585));
        lbInstrucciones.setForeground(new Color(-16777216));
        lbInstrucciones.setText("Indicaciones:");
        panelInstrucciones.add(lbInstrucciones, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbPasos1 = new JLabel();
        lbPasos1.setBackground(new Color(-533585));
        lbPasos1.setForeground(new Color(-16777216));
        lbPasos1.setText("1.- Primero teclee el número.");
        panelInstrucciones.add(lbPasos1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbPaso2 = new JLabel();
        lbPaso2.setBackground(new Color(-533585));
        lbPaso2.setForeground(new Color(-16777216));
        lbPaso2.setText("2.- Después de click en el botón de la operación del que desea realizar.");
        panelInstrucciones.add(lbPaso2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbPaso3 = new JLabel();
        lbPaso3.setBackground(new Color(-533585));
        lbPaso3.setForeground(new Color(-16777216));
        lbPaso3.setText("3.- Para el botón ^ primero teclear el número que desea ");
        panelInstrucciones.add(lbPaso3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbPaso4 = new JLabel();
        lbPaso4.setBackground(new Color(-533585));
        lbPaso4.setForeground(new Color(-16777216));
        lbPaso4.setText("obtener la potencia, después dar click al botón y despues teclear la potencia. Ejemplo-> 39^2.");
        panelInstrucciones.add(lbPaso4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbPasosFinal = new JLabel();
        lbPasosFinal.setBackground(new Color(-533585));
        lbPasosFinal.setForeground(new Color(-16777216));
        lbPasosFinal.setText("Finalmente oprimir el boton de igual.");
        panelInstrucciones.add(lbPasosFinal, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbNota = new JLabel();
        lbNota.setBackground(new Color(-533585));
        lbNota.setForeground(new Color(-16777216));
        lbNota.setText("Nota:");
        panelInstrucciones.add(lbNota, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbNotaFinal = new JLabel();
        lbNotaFinal.setBackground(new Color(-533585));
        lbNotaFinal.setForeground(new Color(-16777216));
        lbNotaFinal.setText("El botón igual solo es para la potencia.");
        panelInstrucciones.add(lbNotaFinal, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        igualbutton1 = new JButton();
        igualbutton1.setBackground(new Color(-7422098));
        Font igualbutton1Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, igualbutton1.getFont());
        if (igualbutton1Font != null) igualbutton1.setFont(igualbutton1Font);
        igualbutton1.setText("=");
        panelCalculadora.add(igualbutton1, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        menosbutton1 = new JButton();
        menosbutton1.setBackground(new Color(-4251074));
        Font menosbutton1Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD, 20, menosbutton1.getFont());
        if (menosbutton1Font != null) menosbutton1.setFont(menosbutton1Font);
        menosbutton1.setText("-");
        panelCalculadora.add(menosbutton1, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        regresarInicioButton = new JButton();
        regresarInicioButton.setBackground(new Color(-13686337));
        regresarInicioButton.setText("Regresar Inicio");
        panelCalculadora.add(regresarInicioButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font    font             = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac            = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font    fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelCalculadora;
    }

    String numero           = "";
    double numero2          = 0;
    int    numero3          = 0;
    double resultado;
    double angulosARadianes = 0;
    String resultadoString  = "";
    double base             = 0;
    int    exponente        = 0;
    String baseString       = "";
    String exponenteString  = "";
    int    potencia         = 0;

    public void metodoActionListener() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("0");
                } else {
                    numero = lbNumero.getText() + "0";
                    lbNumero.setText(numero);
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("1");
                } else {
                    numero = lbNumero.getText() + "1";
                    lbNumero.setText(numero);
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("2");
                } else {
                    numero = lbNumero.getText() + "2";
                    lbNumero.setText(numero);
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("3");
                } else {
                    numero = lbNumero.getText() + "3";
                    lbNumero.setText(numero);
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("4");
                } else {
                    numero = lbNumero.getText() + "4";
                    lbNumero.setText(numero);
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("5");
                } else {
                    numero = lbNumero.getText() + "5";
                    lbNumero.setText(numero);
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("6");
                } else {
                    numero = lbNumero.getText() + "6";
                    lbNumero.setText(numero);
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("7");
                } else {
                    numero = lbNumero.getText() + "7";
                    lbNumero.setText(numero);
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("8");
                } else {
                    numero = lbNumero.getText() + "8";
                    lbNumero.setText(numero);
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("9");
                } else {
                    numero = lbNumero.getText() + "9";
                    lbNumero.setText(numero);
                }
            }
        });
        puntobutton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText(".");
                } else {
                    numero = lbNumero.getText() + ".";
                    lbNumero.setText(numero);
                }
            }
        });
        PotenciaButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("^");
                } else {
                    numero = lbNumero.getText() + "^";
                    lbNumero.setText(numero);
                }
            }
        });
        menosbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbNumero == null) {
                    lbNumero.setText("-");
                } else {
                    numero = lbNumero.getText() + "-";
                    lbNumero.setText(numero);
                }
            }
        });
        regresarInicioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        try {
            raizButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero2 = Double.parseDouble(numero);
                    resultado = raizCuadrada(numero2);
                    resultadoString = "Raiz(" + numero + ") = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            nButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero3 = Integer.parseInt(numero);
                    resultado = factorial(numero3);
                    resultadoString = "(" + numero3 + ")! = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            xButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero2 = Double.parseDouble(numero);
                    resultado = valorAbsoluto(numero2);
                    resultadoString = "|" + numero2 + "| = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            cosXButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero2 = Double.parseDouble(numero);
                    angulosARadianes = angulosARadianes(numero2);
                    resultado = cosenoAngulo(angulosARadianes);
                    resultadoString = "cos(" + numero2 + ") = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            senXButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero2 = Double.parseDouble(numero);
                    angulosARadianes = angulosARadianes(numero2);
                    resultado = senoAngulo(angulosARadianes);
                    resultadoString = "sen(" + numero2 + ") = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            tanXButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = lbNumero.getText();
                    numero2 = Double.parseDouble(numero);
                    angulosARadianes = angulosARadianes(numero2);
                    resultado = tangenteAngulo(angulosARadianes);
                    resultadoString = "tan(" + numero2 + ") = " + resultado;
                    lbNumero.setText(resultadoString);
                }
            });
            igualbutton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        numero = lbNumero.getText();
                        potencia = numero.indexOf("^");

                        if (potencia != 0 && potencia != numero.length()) {
                            baseString = numero.substring(0, potencia);
                            exponenteString = numero.substring(potencia, numero.length());

                            baseString = baseString.replace("^", "");
                            exponenteString = exponenteString.replace("^", "");

                            base = Double.parseDouble(baseString);
                            exponente = Integer.parseInt(exponenteString);
                            resultado = potencia(base, exponente);
                            resultadoString = base + "^" + exponente + " = " + resultado;
                            lbNumero.setText(resultadoString);
                        } else {
                            JOptionPane.showMessageDialog(null, "Escribiste mal la expresión");
                        }
                    } catch (NullPointerException ex) {
                        JOptionPane.showMessageDialog(null, "No ha escrito la expresión");
                    }
                }
            });
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No ha ingresado algún numero en la calculadora");
        }
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbNumero.setText("");
            }
        });
    }
}
