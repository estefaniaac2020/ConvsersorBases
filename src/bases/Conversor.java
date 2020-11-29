package bases;
/**
 *
 * @author Equipo 4
 */
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static java.lang.Math.*;
import java.awt.Toolkit;


public class Conversor extends javax.swing.JFrame {
       private int baseNumero;     //Numero de base que se seleccionara en comboBox
    /**
     * Creates new form Conversor
     */     
    public Conversor() {
        initComponents();           //Componentes graficos
        this.setLocationRelativeTo(null);
        setTitle("Convsersiones Númericas"); //Titulo de ventana
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Formulario = new javax.swing.JPanel();
        Origen = new javax.swing.JComboBox();
        Base_Origen = new javax.swing.JLabel();
        Destino = new javax.swing.JLabel();
        Base_destino = new javax.swing.JComboBox();
        Titulo = new javax.swing.JLabel();
        ingrese = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        numConvertir = new javax.swing.JTextField();
        numResul = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Barra = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        Regresar = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(683, 470));

        Formulario.setBackground(new java.awt.Color(0, 153, 0));
        Formulario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Formulario.setPreferredSize(new java.awt.Dimension(683, 470));

        Origen.setBackground(new java.awt.Color(102, 204, 255));
        Origen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", " ", " " }));
        Origen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Origen.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Origen.setPreferredSize(new java.awt.Dimension(40, 23));
        Origen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OrigenItemStateChanged(evt);
            }
        });
        Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigenActionPerformed(evt);
            }
        });

        Base_Origen.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Base_Origen.setText("Eliga  la base origen :");

        Destino.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Destino.setText("Eliga base a destino:");

        Base_destino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        Base_destino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Base_destinoItemStateChanged(evt);
            }
        });
        Base_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Base_destinoActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("CONVERTIDOR DE BASES NUMÉRICAS");

        ingrese.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        ingrese.setText("Ingrese número a convertir:");

        Resultado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Resultado.setText("El resultado es:");

        convertir.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        numConvertir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numConvertirFocusGained(evt);
            }
        });
        numConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numConvertirActionPerformed(evt);
            }
        });
        numConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numConvertirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numConvertirKeyTyped(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Escudo_UPIICSA (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingrese))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(numResul))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FormularioLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(Destino)
                            .addGap(18, 18, 18)
                            .addComponent(Base_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormularioLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(Base_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Base_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingrese)
                    .addComponent(numConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Destino)
                    .addComponent(Base_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numResul, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        Inicio.setText("Inicio");
        Inicio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        Regresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        Inicio.add(Regresar);

        Barra.add(Inicio);

        Ayuda.setText("Ayuda");
        Ayuda.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        Acerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Acerca.setText("Acerca de...");
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });
        Ayuda.add(Acerca);

        Barra.add(Ayuda);

        setJMenuBar(Barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        // Obtencion los datos seleccionados por el usuario de los comboBox "Origen" y "Base_Destino"
        String baseOr=Origen.getSelectedItem().toString();     //Base origen seleccionada(base de numero ingresado)
        String baseDe=Base_destino.getSelectedItem().toString(); //Base destino seleccionada (base a convertir numero ingresado)
        String numeroC=numConvertir.getText();    //numero ingresado por el usuario
        // Conversion númerica       
        int baseOrigen=Integer.parseInt(baseOr);    //Base origen que se convertira con clase Integer
        int baseDestino=Integer.parseInt(baseDe);  // Base destino que resultara con clase Integer
        
        String resultadoBase = Integer.toString(Integer.valueOf(numeroC, baseOrigen), baseDestino); //Resultado de conversion
        numResul.setText(resultadoBase); //impresion de resultado de conversion
    }//GEN-LAST:event_convertirActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Inicio a= new Inicio(); //Funcion de boton uitem de menu bar "Regresar" a ventana "Inicio"
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
        Ayuda a=new Ayuda(); //Funcion de boton item de menu bar "Acerca" a ventana "Ayuda"
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AcercaActionPerformed

    private void numConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numConvertirActionPerformed

    private void numConvertirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numConvertirKeyReleased
        numConvertir.setText(numConvertir.getText().toUpperCase()); //Obtiene el numero ingresado
    }//GEN-LAST:event_numConvertirKeyReleased

    private void numConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numConvertirKeyTyped
      if(numConvertir.getText().length()>=10){  //Solo admite numero de un tamaño de 10 caracteres 
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
      char c = evt.getKeyChar();
       c = Character.toUpperCase(c); // Al ingresar letras las convertira en mayusculas 
        
        if(Origen.getSelectedIndex()==0){  //Se elige opcion base 2 
          if(c!='1' && c!='0') evt.consume();  //solo admite teclas 01
          setTitle("Número válido");
       }
        else if(Origen.getSelectedIndex() == 1){ //Se elige opcion base 3
          if(c!='0' && c!='1' && c!='2') evt.consume(); //solo admite teclas 012
          setTitle("Número válido");
       }
        else if(Origen.getSelectedIndex() == 2){ //Se elige opcion base 4
          if(c!='0' && c!='1' && c!='2'&& c!='3') evt.consume(); //solo admite teclas 0123
          setTitle("Número válido");
       }
        else if(Origen.getSelectedIndex() == 3){  //Se elige opcion base 5 
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4') evt.consume(); //solo admite teclas 01234
          setTitle("Número válido");
       }
        else if(Origen.getSelectedIndex() == 4){  //Se elige opcion base 6
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5') evt.consume();//solo admite teclas 012345
          setTitle("Número válido");
       }
        else if(Origen.getSelectedIndex() == 5){ //Se elige opcion base 7
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6') evt.consume();
          setTitle("Número válido"); //solo admite teclas 0123456
       }
        else if(Origen.getSelectedIndex() == 6){ //Se elige opcion base 8
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7') evt.consume();
          setTitle("Número válido"); //solo admite teclas 01234567
       }
        else if(Origen.getSelectedIndex() == 7){ //Se elige opcion base 9
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8') evt.consume();
          setTitle("Número válido");  //solo admite teclas 01234578
       }
        else if(Origen.getSelectedIndex() == 8){ //Se elige opcion base 10
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9') evt.consume();
          setTitle("Número válido");  //solo admite teclas 012345789
       }
        else if(Origen.getSelectedIndex() == 9){ //Se elige opcion base 11
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A') evt.consume();
          setTitle("Número válido"); //solo admite teclas 012345789A
       }
        else if(Origen.getSelectedIndex() == 10){ //Se elige opcion base 12
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A'&& c!='B') evt.consume();
          setTitle("Número válido"); //solo admite teclas 012345789AB
       }
        else if(Origen.getSelectedIndex() == 11){ //Se elige opcion base 13
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A'&& c!='B'&& c!='C') evt.consume();
          setTitle("Número válido");  //solo admite teclas 012345789ABC
       }
        else if(Origen.getSelectedIndex() == 12){ //Se elige opcion base 14
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A'&& c!='B'&& c!='C'&& c!='D') evt.consume();
          setTitle("Número válido"); //solo admite teclas 012345789ABCD
       }
       else if(Origen.getSelectedIndex() == 13){ //Se elige opcion base 15
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A'&& c!='B'&& c!='C'&& c!='D'&& c!='E') evt.consume();
          setTitle("Número válido"); //solo admite teclas 012345789ABCDE
       }
        else if(Origen.getSelectedIndex() == 14){ //Se elige opcion base 16
          if(c!='0' && c!='1' && c!='2'&& c!='3'&& c!='4'&& c!='5'&& c!='6'&& c!='7'&& c!='8'&& c!='9'&& c!='A'&& c!='B'&& c!='C'&& c!='D'&& c!='E'&& c!='F') evt.consume();
          setTitle("Número válido"); //solo admite teclas 012345789ABCDEF
       }
        
 
   
    }//GEN-LAST:event_numConvertirKeyTyped

    private void numConvertirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numConvertirFocusGained
        numConvertir.selectAll(); 
    }//GEN-LAST:event_numConvertirFocusGained

    private void OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigenActionPerformed
     
       
    }//GEN-LAST:event_OrigenActionPerformed

    private void OrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OrigenItemStateChanged
        //Se elige base origen del numero ingresado en comboBox "Origen"
        if(Origen.getSelectedIndex() == 0 ) {// sistema binario
            baseNumero=2;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 1 ) {// sistema ternario
            baseNumero=3;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 2 ) {// sistema cuaternario
            baseNumero=4;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 3 ) {// sistema quinario
            baseNumero=5;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 4 ) {// sistema hexal
            baseNumero=6;
            numConvertir.setText(null);
        }

        if(Origen.getSelectedIndex() == 5) {// sistema heptal
            baseNumero=7;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 6) {// sistema octal
            baseNumero=8;
            numConvertir.setText(null);
        }

        if(Origen.getSelectedIndex() == 7) {// sistema nonario
            baseNumero=9;
            numConvertir.setText(null);
        }

        if(Origen.getSelectedIndex() == 8) {// sistema decimal
            baseNumero=10;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 9) {// sistema undecimal
            baseNumero=11;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 10) {// sistema duodecimal
            baseNumero=12;
            numConvertir.setText(null);
        }

        if(Origen.getSelectedIndex() == 11) {// sistema tridecimal
            baseNumero=13;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 12) {// sistema cuatridecimal
            baseNumero=14;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 13) {// sistema quidecimal
            baseNumero=15;
            numConvertir.setText(null);
        }
        if(Origen.getSelectedIndex() == 14) {// sistema hexadecimal
            baseNumero=16;
            numConvertir.setText(null);
        }
    }//GEN-LAST:event_OrigenItemStateChanged

    private void Base_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Base_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Base_destinoActionPerformed

    private void Base_destinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Base_destinoItemStateChanged
        
        
    }//GEN-LAST:event_Base_destinoItemStateChanged

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        numConvertir.setText(null);  //Boton "Limpiar" borra numero ingresado
        numResul.setText(null);      //Boton "Limpiar" borra resultado de conversion
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();  //Boton "Salir" sale del programa
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acerca;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuBar Barra;
    private javax.swing.JLabel Base_Origen;
    private javax.swing.JComboBox Base_destino;
    private javax.swing.JLabel Destino;
    private javax.swing.JPanel Formulario;
    private javax.swing.JMenu Inicio;
    private javax.swing.JComboBox Origen;
    private javax.swing.JMenuItem Regresar;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton convertir;
    private javax.swing.JLabel ingrese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField numConvertir;
    private javax.swing.JTextField numResul;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
