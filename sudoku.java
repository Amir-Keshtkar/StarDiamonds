package suduko;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class sudoku extends javax.swing.JFrame {
    private static boolean Eraser = false;
    private static JButton[][] buttons;
    private static JPanel[][] panels;
    private static final Color BLUE_COLOR = new Color(125, 140, 215);
    private static final Color ORANGE_COLOR = new Color(255, 204, 102);
    private static Color firstColor;
    private static int[][] ijSaver = new int[9][9];
    private static int X;
    private static int Y;
    private static Panel p = new Panel();
    public sudoku() {
        initComponents();
        main.setVisible(true);
        this.setSize(1308, 942);
        gameBoard.setVisible(false);
        main.setSize(1308, 942);
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);
        try {
            File file = new File("./img/eraser.png");
            BufferedImage img = ImageIO.read(file);
            jToggleButton1.setIcon(new ImageIcon(img.getScaledInstance(35, 35, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(sudoku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        main = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        gameBoard = new javax.swing.JPanel();
        Board = new javax.swing.JPanel();
        Appear = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        main.setBackground(new java.awt.Color(51, 51, 51));
        main.setForeground(new java.awt.Color(51, 51, 51));
        main.setFocusable(false);
        main.setPreferredSize(new java.awt.Dimension(1305, 924));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Mj_Badr Point", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Sudoku");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Opium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("Quit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Opium", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 255));
        jButton4.setText("LeaderBoard");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Opium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Start");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(569, 569, 569))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gameBoard.setBackground(new java.awt.Color(51, 51, 51));
        gameBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gameBoard.setPreferredSize(new java.awt.Dimension(1408, 1042));
        gameBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameBoardMouseClicked(evt);
            }
        });

        Board.setBackground(new java.awt.Color(0, 0, 0));
        Board.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardMouseClicked(evt);
            }
        });
        Board.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appear.setBackground(new java.awt.Color(0, 51, 51));

        jToggleButton2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton2.setText("1");
        jToggleButton2.setFocusPainted(false);
        jToggleButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton3.setText("2");
        jToggleButton3.setFocusPainted(false);
        jToggleButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton4.setText("3");
        jToggleButton4.setFocusPainted(false);
        jToggleButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton5.setText("4");
        jToggleButton5.setFocusPainted(false);
        jToggleButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton6.setText("7");
        jToggleButton6.setBorder(null);
        jToggleButton6.setFocusPainted(false);
        jToggleButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton7.setText("6");
        jToggleButton7.setFocusPainted(false);
        jToggleButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton8.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton8.setText("8");
        jToggleButton8.setFocusPainted(false);
        jToggleButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton9.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton9.setText("9");
        jToggleButton9.setFocusPainted(false);
        jToggleButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jToggleButton10);
        jToggleButton10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jToggleButton10.setForeground(new java.awt.Color(204, 255, 255));
        jToggleButton10.setText("5");
        jToggleButton10.setFocusPainted(false);
        jToggleButton10.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppearLayout = new javax.swing.GroupLayout(Appear);
        Appear.setLayout(AppearLayout);
        AppearLayout.setHorizontalGroup(
            AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppearLayout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AppearLayout.createSequentialGroup()
                        .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AppearLayout.createSequentialGroup()
                                .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AppearLayout.createSequentialGroup()
                                .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AppearLayout.setVerticalGroup(
            AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AppearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton6.getAccessibleContext().setAccessibleParent(gameBoard);

        jToggleButton1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setBorder(null);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameBoardLayout = new javax.swing.GroupLayout(gameBoard);
        gameBoard.setLayout(gameBoardLayout);
        gameBoardLayout.setHorizontalGroup(
            gameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(gameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Appear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        gameBoardLayout.setVerticalGroup(
            gameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardLayout.createSequentialGroup()
                .addGroup(gameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameBoardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(Appear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameBoardLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 52, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        jPanel1.setVisible(false);
        JButton[] dif = new JButton[3];
        Color n = new Color(51, 153, 255);
        for (int i = 0; i < 3; i++) {
            dif[i] = new JButton();
            jPanel3.add(dif[i]);
            dif[i].setBounds(110, 110 + 50 * i, 170, 50);
            dif[i].setContentAreaFilled(false);
            dif[i].setForeground(n);
            dif[i].setFont(new Font("Opium", 0, 19));
        }
        dif[0].setText("Easy");
        dif[1].setText("Meddium");
        dif[2].setText("Difficult");
        for (int cv = 0; cv < 3; cv++) {
            int r = cv;
            dif[cv].addActionListener((ActionEvent e) -> {
                main.setVisible(false);
                gameBoard.setVisible(true);
                this.setSize(1308, 942);
                Board.setLayout(new GridLayout(3, 3, 0, 0));
                Board.setSize(750, 750);
                buttons = new JButton[9][9];
                panels = new JPanel[3][3];
                gameBoard.setSize(1308, 942);
                Random rn = new Random();
                int k, l, counterx = 1, countery = 1;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        panels[i][j] = new JPanel();
                        panels[i][j].setLayout(new GridLayout(3, 3, 0, 0));
                        Board.add(panels[i][j]);
                        panels[i][j].setBorder(new LineBorder(Color.black, 3));
                        panels[i][j].setBounds(0, 0, 370, 370);
                        Color v = new Color(rn.nextInt(255), rn.nextInt(255), rn.nextInt(255));
                        panels[i][j].setBackground(v);
                        for (k = i * 3; k < 3 * counterx; k++) {
                            l = j * 3;
                            for (; l < 3 * countery; l++) {
                                buttons[k][l] = new JButton();
                                buttons[k][l].setBounds(0, 0, 75, 75);
                                panels[i][j].add(buttons[k][l]);
                            }
                        }
                        countery++;
                    }
                    counterx++;
                    countery = 1;
                }
                firstColor = buttons[0][0].getBackground();
                try {
                    makeUpBoard(r);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(sudoku.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(sudoku.class.getName()).log(Level.SEVERE, null, ex);
                }
                Action();
            });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private static void makeUpBoard(int r) throws FileNotFoundException, IOException {
        //// use file g
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ijSaver[i][j] = -1;
            }
        }
        File file = null;
        for (int i = 0; i < 3; i++) {
            if (i == r) {
                file = new File("makeUpBoard" + (r + 1) + ".txt");
            }
        }
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int i = 0;
        while ((line = buffer.readLine()) != null) {
            String[] number = line.split(" ");
            for (int j = 0; j < number.length; j++) {
                if (!number[j].equals("0")) {
                    buttons[i][j].setText(number[j]);
                    buttons[i][j].setBackground(BLUE_COLOR);
                    buttons[i][j].setFont(new java.awt.Font("Tahoma", 0, 46));
                    ijSaver[i][j] = 0;
                }
            }
            i++;
        }
        buffer.close();
    }

    private static void Action() {
        gameBoard.add(p);
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int i = r;
                int j = c;
                buttons[i][j].addActionListener((ActionEvent e) -> {
                    if (e.getSource() == buttons[i][j]) {
                        if (Eraser == true && ijSaver[i][j] != 0) {
                            buttons[i][j].setText("");
                        } else if (Eraser == false && ijSaver[i][j] != 0) {
                            p.setVisible(false);
                            p.setBounds(X, Y, 30, 30);
                            p.setVisible(true);
                            p.setBackground(Color.CYAN);
//                            int n = JOptionPane.showOptionDialog(null, "", "", 0, 0, null, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}, null);
//                            if (Search(i, j, n + 1) == true && n != -1) {
//                                buttons[i][j].setText((n + 1) + "");
//                                buttons[i][j].setFont(new java.awt.Font("Tahoma", 0, 46));
//                                if (isPainted(n + 1) == true) {
//                                    buttons[i][j].setBackground(ORANGE_COLOR);
//                                }
//                            }
                        }
                    }
                    boolean isEnd = true;
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            if (buttons[k][l].getText().isEmpty() == true) {
                                isEnd = false;
                                break;
                            }
                        }
                    }
                    if (isEnd == true) {
                        JOptionPane.showMessageDialog(gameBoard, "Congratulations! you won this game");
                        gameBoard.setVisible(false);
                        main.setVisible(true);
                        Board.removeAll();
                        jPanel3.setVisible(false);
                        jPanel1.setVisible(true);
                    }
                });
            }
        }
    }

    private static boolean isPainted(int k) {
        boolean have = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (buttons[i][j].getText().matches(k + "") && buttons[i][j].getBackground().equals(ORANGE_COLOR)) {
                    have = true;
                }
            }
        }
        if (have == true) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean Search(int m, int n, int s) {
        int k, l, counterx = 1, countery = 1, ii = 0, jj = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (k = i * 3; k < 3 * counterx; k++) {
                    l = j * 3;
                    for (; l < 3 * countery; l++) {
                        if (k == m && l == n) {
                            jj = j;
                            ii = i;
                        }
                    }
                }
                countery++;
            }
            counterx++;
            countery = 1;
        }
        boolean isThere = false;
        counterx = 1;
        countery = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (k = i * 3; k < 3 * counterx; k++) {
                    l = j * 3;
                    for (; l < 3 * countery; l++) {
                        if (jj == j && ii == i) {
                            if (buttons[k][l].getText().equals(s + "")) {
                                isThere = true;
                            }
                        }
                    }
                }
                countery++;
            }
            counterx++;
            countery = 1;
        }
        for (int i = 0; i < 9; i++) {
            if (buttons[i][n].getText().equals(s + "")) {
                isThere = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (buttons[m][i].getText().equals(s + "")) {
                isThere = true;
            }
        }
        if (isThere == true) {
            return false;
        } else {
            return true;
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("1")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("2")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("3")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed
    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("4")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed
    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("5")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed
    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("6")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed
    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("7")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed
    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("8")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed
    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        Eraser = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./img/pencil.png");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
        gameBoard.setCursor(c);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
                if (buttons[i][j].getText().equals("9")) {
                    buttons[i][j].setBackground(ORANGE_COLOR);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Eraser = Eraser != true;
        if (Eraser == true) {

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage("./img/eraser.png");
            java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(gameBoard.getX(), gameBoard.getY()), "img");
            gameBoard.setCursor(c);
        } else {
            gameBoard.setCursor(null);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ijSaver[i][j] == 0) {
                    buttons[i][j].setBackground(BLUE_COLOR);
                } else {
                    buttons[i][j].setBackground(firstColor);
                }
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int n = JOptionPane.showOptionDialog(null, "Are you sure?", "", 0, JOptionPane.YES_NO_OPTION, null, null, null);
        if (n == 0) {
            gameBoard.setVisible(false);
            main.setVisible(true);
            Board.removeAll();
            jPanel3.setVisible(false);
            jPanel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void BoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BoardMouseClicked

    private void gameBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameBoardMouseClicked
        // TODO add your handling code here:
        X = evt.getX();
        Y = evt.getY();
        System.out.println(X + " " + Y);
    }//GEN-LAST:event_gameBoardMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appear;
    private static javax.swing.JPanel Board;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JPanel gameBoard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private static javax.swing.JToggleButton jToggleButton10;
    private static javax.swing.JToggleButton jToggleButton2;
    private static javax.swing.JToggleButton jToggleButton3;
    private static javax.swing.JToggleButton jToggleButton4;
    private static javax.swing.JToggleButton jToggleButton5;
    private static javax.swing.JToggleButton jToggleButton6;
    private static javax.swing.JToggleButton jToggleButton7;
    private static javax.swing.JToggleButton jToggleButton8;
    private static javax.swing.JToggleButton jToggleButton9;
    private static javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
