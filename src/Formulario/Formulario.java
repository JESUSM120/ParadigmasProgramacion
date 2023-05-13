/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Formulario extends javax.swing.JFrame {

    private List<Persona> personas = new ArrayList<>();
    List<Persona> personasMilenarias = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    private boolean columnasAgregadas = false;

    public Formulario() {
        initComponents();
        llenarTabla();
        TablaPersonas.setModel(model);
    }

    private void agregarColumnasTabla() {
        if (!columnasAgregadas) {
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Año Nacimiento");
            model.addColumn("Salario");
            model.addColumn("Coeficiente");
            columnasAgregadas = true;
        }
    }

    private void llenarTabla() {
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Año Nacimiento");
        model.addColumn("Salario");
        model.addColumn("Coeficiente");
        personas.add(new Persona(0, "Roberto", "Tellez", 1995, 218, 6.55));
        personas.add(new Persona(1, "Maria", "González", 2013, 2, 5.67));
        personas.add(new Persona(2, "Juan", "Davila", 2003, 299, 1.99));
        personas.add(new Persona(3, "Guillermo", "Tellez", 1997, 507, 4.18));
        personas.add(new Persona(4, "Elizabeth", "Sánchez", 2015, 605, 0.42));
        personas.add(new Persona(5, "Guillermo", "Robles", 2018, 636, 6.97));
        personas.add(new Persona(6, "Maria", "Robles", 1993, 307, 4.92));
        personas.add(new Persona(7, "Elizabeth", "González", 1998, 44, 1.47));
        personas.add(new Persona(8, "Juan", "Juárez", 2020, 632, 5.36));
        personas.add(new Persona(9, "Juan", "Sánchez", 2017, 619, 0.55));
        personas.add(new Persona(10, "Jaime", "González", 2014, 435, 6.75));
        personas.add(new Persona(11, "Maria", "González", 2005, 377, 2.52));
        personas.add(new Persona(12, "Linda", "Munguia", 2014, 440, 8.84));
        personas.add(new Persona(13, "Linda", "Davila", 2010, 724, 2.37));
        personas.add(new Persona(14, "Maria", "Robles", 1996, 929, 2.25));
        personas.add(new Persona(15, "Barbara", "González", 2005, 617, 3.69));
        personas.add(new Persona(16, "Elizabeth", "Munguia", 2001, 179, 4.69));
        personas.add(new Persona(17, "Roberto", "Méndez", 2013, 626, 8.36));
        personas.add(new Persona(18, "Miguel", "Juárez", 2002, 781, 3.93));
        personas.add(new Persona(19, "Roberto", "Robles", 2007, 270, 4.77));
        personas.add(new Persona(20, "Miguel", "Méndez", 2022, 731, 2.82));
        personas.add(new Persona(21, "Linda", "Robles", 2010, 192, 1.68));
        personas.add(new Persona(22, "Roberto", "Juárez", 2008, 151, 2.03));
        personas.add(new Persona(23, "Maria", "Robles", 2016, 734, 1.61));
        personas.add(new Persona(24, "Jaime", "Sánchez", 2018, 985, 0.41));
        personas.add(new Persona(25, "Maria", "González", 2006, 970, 3.85));
        personas.add(new Persona(26, "Barbara", "Robles", 2005, 453, 1.02));
        personas.add(new Persona(27, "Patricia", "Davila", 2002, 966, 8.21));
        personas.add(new Persona(28, "Elizabeth", "Robles", 2022, 338, 4.4));
        personas.add(new Persona(29, "Guillermo", "García", 2002, 400, 6.77));
        personas.add(new Persona(30, "Jaime", "García", 2006, 763, 5.32));
        personas.add(new Persona(31, "Patricia", "Tellez", 2020, 309, 5.58));
        personas.add(new Persona(32, "Miguel", "García", 1998, 301, 5.33));
        personas.add(new Persona(33, "Patricia", "Davila", 2014, 275, 3.45));
        personas.add(new Persona(34, "Miguel", "Sánchez", 2021, 857, 1.77));
        personas.add(new Persona(35, "Miguel", "García", 2004, 744, 1.71));
        personas.add(new Persona(36, "Juan", "Sánchez", 1998, 452, 4.34));
        personas.add(new Persona(37, "Guillermo", "Sánchez", 2017, 383, 0.54));
        personas.add(new Persona(38, "Linda", "Sánchez", 2020, 417, 8.39));
        personas.add(new Persona(39, "Patricia", "Robles", 2017, 913, 3.42));
        personas.add(new Persona(40, "Maria", "Suárez", 2013, 832, 9.67));
        personas.add(new Persona(41, "Roberto", "Munguia", 2010, 976, 6.08));
        personas.add(new Persona(42, "Elizabeth", "Davila", 2016, 887, 7.78));
        personas.add(new Persona(43, "Juan", "González", 2014, 471, 7.09));
        personas.add(new Persona(44, "Miguel", "Juárez", 2009, 54, 5.24));
        personas.add(new Persona(45, "Jaime", "Munguia", 2003, 310, 0.57));
        personas.add(new Persona(46, "Roberto", "Suárez", 2003, 136, 0.22));
        personas.add(new Persona(47, "Barbara", "Juárez", 2005, 514, 1.33));
        personas.add(new Persona(48, "Guillermo", "Tellez", 2018, 933, 2.61));
        personas.add(new Persona(49, "Juan", "García", 1998, 185, 9.06));
        personas.add(new Persona(50, "Roberto", "Suárez", 2005, 652, 4.66));
        personas.add(new Persona(51, "Linda", "Juárez", 2022, 700, 9.96));
        personas.add(new Persona(52, "Barbara", "González", 1995, 53, 8.64));
        personas.add(new Persona(53, "Barbara", "Robles", 2010, 710, 6.09));
        personas.add(new Persona(54, "Jaime", "Sánchez", 2015, 644, 6.65));
        personas.add(new Persona(55, "Patricia", "Suárez", 2016, 393, 9.22));
        personas.add(new Persona(56, "Barbara", "Davila", 2007, 946, 3.79));
        personas.add(new Persona(57, "Juan", "Davila", 2010, 481, 4.05));
        personas.add(new Persona(58, "Juan", "Robles", 1996, 285, 0.14));
        personas.add(new Persona(59, "Elizabeth", "Munguia", 2007, 576, 8.01));
        personas.add(new Persona(60, "Patricia", "Davila", 2004, 799, 1.62));
        personas.add(new Persona(61, "Maria", "Suárez", 2000, 953, 9.55));
        personas.add(new Persona(62, "Jaime", "Sánchez", 2016, 548, 4.92));
        personas.add(new Persona(63, "Guillermo", "Davila", 1998, 497, 4.48));
        personas.add(new Persona(64, "Patricia", "Davila", 2008, 117, 7.09));
        personas.add(new Persona(65, "Guillermo", "Juárez", 2004, 200, 9.95));
        personas.add(new Persona(66, "Elizabeth", "Méndez", 2022, 497, 4.08));
        personas.add(new Persona(67, "Maria", "González", 2017, 142, 6.96));
        personas.add(new Persona(68, "Guillermo", "Juárez", 2009, 810, 1.11));
        personas.add(new Persona(69, "Roberto", "Tellez", 1994, 96, 5.86));
        personas.add(new Persona(70, "Elizabeth", "Munguia", 2002, 509, 4.83));
        personas.add(new Persona(71, "Barbara", "Robles", 2012, 482, 0.79));
        personas.add(new Persona(72, "Guillermo", "Juárez", 2007, 331, 0.52));
        personas.add(new Persona(73, "Juan", "Méndez", 1997, 152, 2.5));
        personas.add(new Persona(74, "Linda", "Robles", 2018, 893, 3.0));
        personas.add(new Persona(75, "Patricia", "González", 2007, 654, 6.92));
        personas.add(new Persona(76, "Patricia", "Sánchez", 2011, 555, 6.3));
        personas.add(new Persona(77, "Patricia", "Tellez", 2021, 182, 5.38));
        personas.add(new Persona(78, "Barbara", "Tellez", 2019, 637, 5.25));
        personas.add(new Persona(79, "Roberto", "González", 1995, 447, 0.89));
        personas.add(new Persona(80, "Jaime", "Méndez", 2003, 258, 9.55));
        personas.add(new Persona(81, "Juan", "Méndez", 2004, 835, 2.77));
        personas.add(new Persona(82, "Patricia", "Davila", 2010, 773, 3.83));
        personas.add(new Persona(83, "Miguel", "Suárez", 1995, 978, 4.5));
        personas.add(new Persona(84, "Linda", "Méndez", 2003, 704, 2.5));
        personas.add(new Persona(85, "Miguel", "Juárez", 1996, 379, 9.0));
        personas.add(new Persona(86, "Linda", "Méndez", 2021, 416, 7.13));
        personas.add(new Persona(87, "Elizabeth", "Juárez", 1999, 121, 4.88));
        personas.add(new Persona(88, "Miguel", "Robles", 2009, 191, 2.81));
        personas.add(new Persona(89, "Elizabeth", "Tellez", 2006, 402, 9.1));
        personas.add(new Persona(90, "Linda", "Munguia", 1995, 688, 4.57));
        personas.add(new Persona(91, "Guillermo", "Davila", 2006, 436, 8.31));
        personas.add(new Persona(92, "Jaime", "Sánchez", 2019, 629, 1.77));
        personas.add(new Persona(93, "Miguel", "Robles", 2007, 249, 6.28));
        personas.add(new Persona(94, "Linda", "Robles", 2002, 732, 6.75));
        personas.add(new Persona(95, "Patricia", "Suárez", 1996, 793, 8.14));
        personas.add(new Persona(96, "Elizabeth", "Davila", 2020, 816, 2.2));
        personas.add(new Persona(97, "Linda", "Suárez", 2009, 943, 9.67));
        personas.add(new Persona(98, "Miguel", "Davila", 2022, 387, 1.76));
        personas.add(new Persona(99, "Patricia", "González", 1994, 413, 8.33));
        for (Persona persona : personas) {
            model.addRow(new Object[]{
                persona.getId(),
                persona.getNombre(),
                persona.getApellido(),
                persona.getAnioNacimiento(),
                persona.getSalario(),
                persona.getCoeficiente()
            });
            TablaPersonas.setModel(model);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ScrollPersonas = new javax.swing.JScrollPane();
        TablaPersonas = new javax.swing.JTable();
        btnNumPerson = new javax.swing.JButton();
        btnSumSalarios = new javax.swing.JButton();
        btnSalmayor = new javax.swing.JButton();
        btnRobles = new javax.swing.JButton();
        btnDespuesDel2000 = new javax.swing.JButton();
        btnCoeficiente5y10 = new javax.swing.JButton();
        btnrobles = new javax.swing.JButton();
        btnTodoslosDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE PERSONAS");

        TablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "AÑO DE NACIMIENTO", "SALARIO", "COEFICIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPersonas.setViewportView(TablaPersonas);
        if (TablaPersonas.getColumnModel().getColumnCount() > 0) {
            TablaPersonas.getColumnModel().getColumn(0).setResizable(false);
            TablaPersonas.getColumnModel().getColumn(1).setResizable(false);
            TablaPersonas.getColumnModel().getColumn(2).setResizable(false);
            TablaPersonas.getColumnModel().getColumn(3).setResizable(false);
            TablaPersonas.getColumnModel().getColumn(4).setResizable(false);
            TablaPersonas.getColumnModel().getColumn(5).setResizable(false);
        }

        btnNumPerson.setText("NUMERO DE PERSONAS");
        btnNumPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumPersonActionPerformed(evt);
            }
        });

        btnSumSalarios.setText("SUMA DE LOS SALARIOS");
        btnSumSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumSalariosActionPerformed(evt);
            }
        });

        btnSalmayor.setText("CANTIDAD DE PERSONAS CON SALARIO MAYOR A 500");
        btnSalmayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalmayorActionPerformed(evt);
            }
        });

        btnRobles.setText("MAYOR SALARIO DE LAS PERSONAS \"ROBLES\"");
        btnRobles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoblesActionPerformed(evt);
            }
        });

        btnDespuesDel2000.setText("PERSONAS QUE NACIERON DESPUES DEL 2000");
        btnDespuesDel2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespuesDel2000ActionPerformed(evt);
            }
        });

        btnCoeficiente5y10.setText("COEFICIENTE DE 5 A 10");
        btnCoeficiente5y10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoeficiente5y10ActionPerformed(evt);
            }
        });

        btnrobles.setText("PERSONAS CON APELLIDO ROBLES");
        btnrobles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroblesActionPerformed(evt);
            }
        });

        btnTodoslosDatos.setText("MOSTRAR TODOS LOS DATOS");
        btnTodoslosDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodoslosDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(428, 428, 428))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ScrollPersonas)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNumPerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnSumSalarios)
                        .addGap(33, 33, 33)
                        .addComponent(btnSalmayor)
                        .addGap(55, 55, 55)
                        .addComponent(btnRobles)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDespuesDel2000)
                        .addGap(51, 51, 51)
                        .addComponent(btnCoeficiente5y10)
                        .addGap(66, 66, 66)
                        .addComponent(btnrobles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTodoslosDatos)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ScrollPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRobles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalmayor)
                        .addComponent(btnSumSalarios)
                        .addComponent(btnNumPerson)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoeficiente5y10)
                    .addComponent(btnDespuesDel2000)
                    .addComponent(btnrobles)
                    .addComponent(btnTodoslosDatos))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumPersonActionPerformed
        // TODO add your handling code here:
        long numeroPersonas = personas.stream()
                .count();
        JOptionPane.showMessageDialog(this, "Numero de personas: " + numeroPersonas);
    }//GEN-LAST:event_btnNumPersonActionPerformed

    private void btnSumSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumSalariosActionPerformed
        // TODO add your handling code here:
        double sumaSalarios = personas.stream()
                .mapToDouble(persona -> persona.getSalario())
                .sum();
        JOptionPane.showMessageDialog(this, "Suma de todos los salarios: " + sumaSalarios);
    }//GEN-LAST:event_btnSumSalariosActionPerformed

    private void btnSalmayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalmayorActionPerformed
        // TODO add your handling code here:
        long cantidad500 = personas.stream()
                .filter(persona -> persona.getSalario() > 500)
                .count();
        JOptionPane.showMessageDialog(this, "Cantidad de personas con un salario mayor a 500: " + cantidad500);
    }//GEN-LAST:event_btnSalmayorActionPerformed

    private void btnRoblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoblesActionPerformed
        // TODO add your handling code here:
        double mayorSalario = personas.stream()
                .filter(persona -> persona.getApellido().equals("Robles"))
                .mapToDouble(persona -> persona.getSalario())
                .max().getAsDouble();
        JOptionPane.showMessageDialog(this, "Mayor salario entre las personas que tenga el apellido Robles: " + mayorSalario);
    }//GEN-LAST:event_btnRoblesActionPerformed

    private void btnDespuesDel2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespuesDel2000ActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);

        personas.stream()
                .filter(p -> p.getAnioNacimiento() > 2000)
                .forEach(p -> {
                    Object[] fila = {p.getId(), p.getNombre(), p.getApellido(), p.getAnioNacimiento(), p.getSalario(), p.getCoeficiente()};
                    model.addRow(fila);
                });

    }//GEN-LAST:event_btnDespuesDel2000ActionPerformed

    private void btnCoeficiente5y10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoeficiente5y10ActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        personas.stream()
                .filter(v -> v.getCoeficiente() >= 5 && v.getCoeficiente() <= 10)
                .collect(Collectors.toList())
                .forEach(p -> {
                    Object[] fila = {p.getId(), p.getNombre(), p.getApellido(), p.getAnioNacimiento(), p.getSalario(), p.getCoeficiente()};
                    model.addRow(fila);
                });
    }//GEN-LAST:event_btnCoeficiente5y10ActionPerformed

    private void btnroblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroblesActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        personas.stream()
                .filter(v -> v.getApellido().equals("Robles"))
                .forEach(p -> {
                    Object[] fila = {p.getId(), p.getNombre(), p.getApellido(), p.getAnioNacimiento(), p.getSalario(), p.getCoeficiente()};
                    model.addRow(fila);
                });
    }//GEN-LAST:event_btnroblesActionPerformed

    private void btnTodoslosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodoslosDatosActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        personas.stream()
                .forEach(p -> {
                    Object[] fila = {p.getId(), p.getNombre(), p.getApellido(), p.getAnioNacimiento(), p.getSalario(), p.getCoeficiente()};
                    model.addRow(fila);
                });
    }//GEN-LAST:event_btnTodoslosDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPersonas;
    private javax.swing.JTable TablaPersonas;
    private javax.swing.JButton btnCoeficiente5y10;
    private javax.swing.JButton btnDespuesDel2000;
    private javax.swing.JButton btnNumPerson;
    private javax.swing.JButton btnRobles;
    private javax.swing.JButton btnSalmayor;
    private javax.swing.JButton btnSumSalarios;
    private javax.swing.JButton btnTodoslosDatos;
    private javax.swing.JButton btnrobles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
