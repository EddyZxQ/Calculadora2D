
package calculadora;


import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;

/**
 *
 * @author Edgar Lopez Calomarde
 */
public class Calculadora extends javax.swing.JFrame {

    
     ScriptEngineManager sem = new ScriptEngineManager();
     ScriptEngine se = sem.getEngineByName("JavaScript");
     
     int x,y;
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        
        try{
        setIconImage(new ImageIcon(getClass().getResource("../images/icono.png")).getImage());
        }catch(Exception ex){
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonapagar = new javax.swing.JButton();
        botonreset = new javax.swing.JButton();
        botondivision = new javax.swing.JButton();
        botonatras = new javax.swing.JButton();
        botonmultipliacion = new javax.swing.JButton();
        botonresta = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botondecimal = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(330, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(114, 188, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 290, 64));

        txtOperacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 290, 42));

        jPanel3.setBackground(new java.awt.Color(177, 177, 252));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 150));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 390));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonapagar.setBackground(new java.awt.Color(54, 105, 220));
        botonapagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonapagar.setForeground(new java.awt.Color(255, 255, 255));
        botonapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        botonapagar.setText("OFF");
        botonapagar.setBorder(null);
        botonapagar.setFocusPainted(false);
        botonapagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonapagar.setPreferredSize(new java.awt.Dimension(85, 85));
        botonapagar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonapagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonapagarActionPerformed(evt);
            }
        });
        jPanel2.add(botonapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 80, 80));

        botonreset.setBackground(new java.awt.Color(54, 105, 220));
        botonreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonreset.setForeground(new java.awt.Color(255, 255, 255));
        botonreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botonreset.setText("C");
        botonreset.setBorder(null);
        botonreset.setFocusPainted(false);
        botonreset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonreset.setPreferredSize(new java.awt.Dimension(85, 85));
        botonreset.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonreset.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonresetActionPerformed(evt);
            }
        });
        jPanel2.add(botonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        botondivision.setBackground(new java.awt.Color(54, 105, 220));
        botondivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botondivision.setForeground(new java.awt.Color(255, 255, 255));
        botondivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botondivision.setText("/");
        botondivision.setBorder(null);
        botondivision.setFocusPainted(false);
        botondivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botondivision.setPreferredSize(new java.awt.Dimension(85, 85));
        botondivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botondivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botondivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondivisionActionPerformed(evt);
            }
        });
        jPanel2.add(botondivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 80));

        botonatras.setBackground(new java.awt.Color(54, 105, 220));
        botonatras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonatras.setForeground(new java.awt.Color(255, 255, 255));
        botonatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonlargo.png"))); // NOI18N
        botonatras.setText("DEL");
        botonatras.setBorder(null);
        botonatras.setFocusPainted(false);
        botonatras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonatras.setPreferredSize(new java.awt.Dimension(85, 85));
        botonatras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonlargo_presionao.png"))); // NOI18N
        botonatras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonlargo_presionao.png"))); // NOI18N
        botonatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonatrasActionPerformed(evt);
            }
        });
        jPanel2.add(botonatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 80));

        botonmultipliacion.setBackground(new java.awt.Color(54, 105, 220));
        botonmultipliacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonmultipliacion.setForeground(new java.awt.Color(255, 255, 255));
        botonmultipliacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botonmultipliacion.setText("x");
        botonmultipliacion.setBorder(null);
        botonmultipliacion.setFocusPainted(false);
        botonmultipliacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonmultipliacion.setPreferredSize(new java.awt.Dimension(85, 85));
        botonmultipliacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonmultipliacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonmultipliacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultipliacionActionPerformed(evt);
            }
        });
        jPanel2.add(botonmultipliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 80));

        botonresta.setBackground(new java.awt.Color(54, 105, 220));
        botonresta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonresta.setForeground(new java.awt.Color(255, 255, 255));
        botonresta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botonresta.setText("-");
        botonresta.setBorder(null);
        botonresta.setFocusPainted(false);
        botonresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonresta.setPreferredSize(new java.awt.Dimension(85, 85));
        botonresta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonresta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestaActionPerformed(evt);
            }
        });
        jPanel2.add(botonresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 80, 80));

        botonsuma.setBackground(new java.awt.Color(54, 105, 220));
        botonsuma.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonsuma.setForeground(new java.awt.Color(255, 255, 255));
        botonsuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botonsuma.setText("+");
        botonsuma.setBorder(null);
        botonsuma.setFocusPainted(false);
        botonsuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonsuma.setPreferredSize(new java.awt.Dimension(85, 85));
        botonsuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonsuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsumaActionPerformed(evt);
            }
        });
        jPanel2.add(botonsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 80, 80));

        botonigual.setBackground(new java.awt.Color(54, 105, 220));
        botonigual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonigual.setForeground(new java.awt.Color(255, 255, 255));
        botonigual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton.png"))); // NOI18N
        botonigual.setText("=");
        botonigual.setBorder(null);
        botonigual.setFocusPainted(false);
        botonigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonigual.setPreferredSize(new java.awt.Dimension(85, 85));
        botonigual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonigual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonigualActionPerformed(evt);
            }
        });
        jPanel2.add(botonigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 80, 80));

        boton7.setBackground(new java.awt.Color(54, 105, 220));
        boton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton7.setText("7");
        boton7.setBorder(null);
        boton7.setFocusPainted(false);
        boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton7.setPreferredSize(new java.awt.Dimension(85, 85));
        boton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        jPanel2.add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 80));

        boton8.setBackground(new java.awt.Color(54, 105, 220));
        boton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton8.setText("8");
        boton8.setBorder(null);
        boton8.setFocusPainted(false);
        boton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton8.setPreferredSize(new java.awt.Dimension(85, 85));
        boton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 80));

        boton9.setBackground(new java.awt.Color(54, 105, 220));
        boton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton9.setText("9");
        boton9.setBorder(null);
        boton9.setFocusPainted(false);
        boton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton9.setPreferredSize(new java.awt.Dimension(85, 85));
        boton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        jPanel2.add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 80));

        boton4.setBackground(new java.awt.Color(54, 105, 220));
        boton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton4.setText("4");
        boton4.setBorder(null);
        boton4.setFocusPainted(false);
        boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton4.setPreferredSize(new java.awt.Dimension(85, 85));
        boton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 80, 80));

        boton5.setBackground(new java.awt.Color(54, 105, 220));
        boton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton5.setText("5");
        boton5.setBorder(null);
        boton5.setFocusPainted(false);
        boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton5.setPreferredSize(new java.awt.Dimension(85, 85));
        boton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel2.add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 80));

        boton6.setBackground(new java.awt.Color(54, 105, 220));
        boton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton6.setText("6");
        boton6.setBorder(null);
        boton6.setFocusPainted(false);
        boton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton6.setPreferredSize(new java.awt.Dimension(85, 85));
        boton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        jPanel2.add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 80));

        boton1.setBackground(new java.awt.Color(54, 105, 220));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton1.setText("1");
        boton1.setBorder(null);
        boton1.setFocusPainted(false);
        boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1.setPreferredSize(new java.awt.Dimension(85, 85));
        boton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, 80));

        boton2.setBackground(new java.awt.Color(54, 105, 220));
        boton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton2.setText("2");
        boton2.setBorder(null);
        boton2.setFocusPainted(false);
        boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton2.setPreferredSize(new java.awt.Dimension(85, 85));
        boton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 80, 80));

        boton3.setBackground(new java.awt.Color(54, 105, 220));
        boton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton3.setText("3");
        boton3.setBorder(null);
        boton3.setFocusPainted(false);
        boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton3.setPreferredSize(new java.awt.Dimension(85, 85));
        boton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, 80));

        botondecimal.setBackground(new java.awt.Color(54, 105, 220));
        botondecimal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botondecimal.setForeground(new java.awt.Color(255, 255, 255));
        botondecimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        botondecimal.setText(".");
        botondecimal.setBorder(null);
        botondecimal.setFocusPainted(false);
        botondecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botondecimal.setPreferredSize(new java.awt.Dimension(85, 85));
        botondecimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botondecimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        botondecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondecimalActionPerformed(evt);
            }
        });
        jPanel2.add(botondecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 80, 80));

        boton0.setBackground(new java.awt.Color(54, 105, 220));
        boton0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton0.setForeground(new java.awt.Color(255, 255, 255));
        boton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado2.png"))); // NOI18N
        boton0.setText("0");
        boton0.setBorder(null);
        boton0.setFocusPainted(false);
        boton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton0.setPreferredSize(new java.awt.Dimension(85, 85));
        boton0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_presionado.png"))); // NOI18N
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        jPanel2.add(boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 80, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 320, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonapagarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonapagarActionPerformed

    private void botonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonresetActionPerformed
    
        txtResultado.setText("");
        txtOperacion.setText("");
        
    }//GEN-LAST:event_botonresetActionPerformed

    private void botondivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondivisionActionPerformed
       addNumber("/");
     
    }//GEN-LAST:event_botondivisionActionPerformed

    private void botonatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonatrasActionPerformed
    String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
    txtOperacion.setText(texto);
    botonigual.doClick();
    }//GEN-LAST:event_botonatrasActionPerformed

    private void botonmultipliacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultipliacionActionPerformed
        addNumber("*");
       
    }//GEN-LAST:event_botonmultipliacionActionPerformed

    private void botonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestaActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_botonrestaActionPerformed

    private void botonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsumaActionPerformed
        addNumber("+");
       
    }//GEN-LAST:event_botonsumaActionPerformed

    private void botonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonigualActionPerformed
        try{
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        }catch (Exception e){
            
         

        }
    }//GEN-LAST:event_botonigualActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        addNumber("7");
        botonigual.doClick();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        addNumber("8");
        botonigual.doClick();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        addNumber("9");
        botonigual.doClick();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        addNumber("4");
        botonigual.doClick();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
       addNumber("5");
       botonigual.doClick();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
       addNumber("6");
       botonigual.doClick();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        addNumber("1");
        botonigual.doClick();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        addNumber("2");
        botonigual.doClick();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        addNumber("3");
        botonigual.doClick();
    }//GEN-LAST:event_boton3ActionPerformed

    private void botondecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondecimalActionPerformed
        addNumber(".");
        botonigual.doClick();
    }//GEN-LAST:event_botondecimalActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        addNumber("0");
        botonigual.doClick();
    }//GEN-LAST:event_boton0ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
       
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
      this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y); 
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Calculadora programa = new Calculadora();
               
        programa.setVisible(true);
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonapagar;
    private javax.swing.JButton botonatras;
    private javax.swing.JButton botondecimal;
    private javax.swing.JButton botondivision;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonmultipliacion;
    private javax.swing.JButton botonreset;
    private javax.swing.JButton botonresta;
    private javax.swing.JButton botonsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
