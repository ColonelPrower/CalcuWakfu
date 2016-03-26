/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JTextField;
/*      */ import org.jdesktop.layout.GroupLayout;
/*      */ import org.jdesktop.layout.GroupLayout.ParallelGroup;
/*      */ import org.jdesktop.layout.GroupLayout.SequentialGroup;
/*      */ 
/*      */ public class Calculadora extends javax.swing.JFrame
/*      */ {
/*   12 */   public int usedpoints = 0;
/*   13 */   public int restpoints = 0;
/*      */   private JTextField NivelActual;
/*      */   private JLabel Placaje;
/*      */   private JButton PonerNivel;
/*      */   private JTextField PuntosActuales;
/*      */   private JTextField PuntosRestantes;
/*      */   private JLabel agiicon;
/*      */   private JLabel anticon; private JTextField atkagua; private JTextField atkaire; private JTextField atkfuego; private JTextField atktierra;
/*   21 */   public Calculadora() { initComponents(); }
/*      */   
/*      */ 
/*      */   private JTextField contagi;
/*      */   private JTextField contant;
/*      */   private JTextField contcrit;
/*      */   private JTextField contesq;
/*      */   private JTextField contfuerza;
/*      */   private JTextField contini;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*   33 */     this.jInternalFrame1 = new javax.swing.JInternalFrame();
/*   34 */     this.puntosdevida = new JLabel();
/*   35 */     this.contpdv = new JTextField();
/*   36 */     this.menospdv = new JButton();
/*   37 */     this.maspdv = new JButton();
/*   38 */     this.iniciativa = new JLabel();
/*   39 */     this.contini = new JTextField();
/*   40 */     this.menosini = new JButton();
/*   41 */     this.esquiva = new JLabel();
/*   42 */     this.masesq = new JButton();
/*   43 */     this.menosesq = new JButton();
/*   44 */     this.contesq = new JTextField();
/*   45 */     this.contplac = new JTextField();
/*   46 */     this.menosplac = new JButton();
/*   47 */     this.masplac = new JButton();
/*   48 */     this.pms = new JLabel();
/*   49 */     this.contpm = new JTextField();
/*   50 */     this.maspa = new JButton();
/*   51 */     this.pas = new JLabel();
/*   52 */     this.menospm = new JButton();
/*   53 */     this.instruccionmilitar = new JLabel();
/*   54 */     this.maspm = new JButton();
/*   55 */     this.mascrit = new JButton();
/*   56 */     this.criticos = new JLabel();
/*   57 */     this.menospa = new JButton();
/*   58 */     this.contcrit = new JTextField();
/*   59 */     this.masini = new JButton();
/*   60 */     this.Placaje = new JLabel();
/*   61 */     this.masins = new JButton();
/*   62 */     this.menosins = new JButton();
/*   63 */     this.contpa = new JTextField();
/*   64 */     this.contins = new JTextField();
/*   65 */     this.menoscrit = new JButton();
/*   66 */     this.contfuerza = new JTextField();
/*   67 */     this.fuerzaicon = new JLabel();
/*   68 */     this.agiicon = new JLabel();
/*   69 */     this.masagi = new JButton();
/*   70 */     this.menosagi = new JButton();
/*   71 */     this.menosfuerza = new JButton();
/*   72 */     this.masfuerza = new JButton();
/*   73 */     this.contagi = new JTextField();
/*   74 */     this.contsuer = new JTextField();
/*   75 */     this.masinte = new JButton();
/*   76 */     this.menosinte = new JButton();
/*   77 */     this.menossuer = new JButton();
/*   78 */     this.massuer = new JButton();
/*   79 */     this.luckicon = new JLabel();
/*   80 */     this.inteicon = new JLabel();
/*   81 */     this.continte = new JTextField();
/*   82 */     this.contperc = new JTextField();
/*   83 */     this.masvol = new JButton();
/*   84 */     this.menosvol = new JButton();
/*   85 */     this.menosperc = new JButton();
/*   86 */     this.masperc = new JButton();
/*   87 */     this.percepicon = new JLabel();
/*   88 */     this.voluntadicon = new JLabel();
/*   89 */     this.contvol = new JTextField();
/*   90 */     this.contant = new JTextField();
/*   91 */     this.menosant = new JButton();
/*   92 */     this.masant = new JButton();
/*   93 */     this.anticon = new JLabel();
/*   94 */     this.pms4 = new JLabel();
/*   95 */     this.masmenosalcance = new javax.swing.JCheckBox();
/*   96 */     this.jInternalFrame2 = new javax.swing.JInternalFrame();
/*   97 */     this.jLabel2 = new JLabel();
/*   98 */     this.puntosusados = new JTextField();
/*   99 */     this.jLabel1 = new JLabel();
/*  100 */     this.NivelActual = new JTextField();
/*  101 */     this.PonerNivel = new JButton();
/*  102 */     this.PuntosActuales = new JTextField();
/*  103 */     this.jLabel3 = new JLabel();
/*  104 */     this.jLabel4 = new JLabel();
/*  105 */     this.PuntosRestantes = new JTextField();
/*  106 */     this.jInternalFrame3 = new javax.swing.JInternalFrame();
/*  107 */     this.jLabel5 = new JLabel();
/*  108 */     this.jLabel6 = new JLabel();
/*  109 */     this.jLabel7 = new JLabel();
/*  110 */     this.jLabel8 = new JLabel();
/*  111 */     this.jLabel9 = new JLabel();
/*  112 */     this.jLabel10 = new JLabel();
/*  113 */     this.jLabel11 = new JLabel();
/*  114 */     this.jLabel12 = new JLabel();
/*  115 */     this.jLabel13 = new JLabel();
/*  116 */     this.jLabel14 = new JLabel();
/*  117 */     this.jLabel15 = new JLabel();
/*  118 */     this.jLabel16 = new JLabel();
/*  119 */     this.atkagua = new JTextField();
/*  120 */     this.atkaire = new JTextField();
/*  121 */     this.atkfuego = new JTextField();
/*  122 */     this.atktierra = new JTextField();
/*  123 */     this.quitapa = new JTextField();
/*  124 */     this.quitapm = new JTextField();
/*  125 */     this.defagua = new JTextField();
/*  126 */     this.defaire = new JTextField();
/*  127 */     this.deffuego = new JTextField();
/*  128 */     this.deftierra = new JTextField();
/*  129 */     this.defpa = new JTextField();
/*  130 */     this.defpm = new JTextField();
/*      */     
/*  132 */     setDefaultCloseOperation(3);
/*  133 */     setTitle("Calculadora Wakfu por Colonel Prower");
/*      */     
/*  135 */     this.jInternalFrame1.setTitle("Caracteristicas");
/*  136 */     this.jInternalFrame1.setVisible(true);
/*      */     
/*  138 */     this.puntosdevida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdv.png")));
/*  139 */     this.puntosdevida.setText("Puntos de Vida");
/*  140 */     this.puntosdevida.setToolTipText("1pdv por  1 de caracteristicas");
/*      */     
/*  142 */     this.contpdv.setColumns(2);
/*  143 */     this.contpdv.setEditable(false);
/*  144 */     this.contpdv.setText("0");
/*  145 */     this.contpdv.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  147 */         Calculadora.this.contpdvActionPerformed(evt);
/*      */       }
/*      */       
/*  150 */     });
/*  151 */     this.menospdv.setText("-");
/*  152 */     this.menospdv.setEnabled(false);
/*  153 */     this.menospdv.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  155 */         Calculadora.this.menospdvActionPerformed(evt);
/*      */       }
/*      */       
/*  158 */     });
/*  159 */     this.maspdv.setText("+");
/*  160 */     this.maspdv.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  162 */         Calculadora.this.maspdvActionPerformed(evt);
/*      */       }
/*      */       
/*  165 */     });
/*  166 */     this.iniciativa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ini.png")));
/*  167 */     this.iniciativa.setText("Iniciativa");
/*  168 */     this.iniciativa.setToolTipText("+1 iniciativa por 2 puntos");
/*      */     
/*  170 */     this.contini.setColumns(2);
/*  171 */     this.contini.setEditable(false);
/*  172 */     this.contini.setText("0");
/*  173 */     this.contini.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  175 */         Calculadora.this.continiActionPerformed(evt);
/*      */       }
/*      */       
/*  178 */     });
/*  179 */     this.menosini.setText("-");
/*  180 */     this.menosini.setEnabled(false);
/*  181 */     this.menosini.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  183 */         Calculadora.this.menosiniActionPerformed(evt);
/*      */       }
/*      */       
/*  186 */     });
/*  187 */     this.esquiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/esquiva.png")));
/*  188 */     this.esquiva.setText("Esquiva");
/*  189 */     this.esquiva.setToolTipText("0.5% de esquiva por 2 puntos");
/*      */     
/*  191 */     this.masesq.setText("+");
/*  192 */     this.masesq.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  194 */         Calculadora.this.masesqActionPerformed(evt);
/*      */       }
/*      */       
/*  197 */     });
/*  198 */     this.menosesq.setText("-");
/*  199 */     this.menosesq.setEnabled(false);
/*  200 */     this.menosesq.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  202 */         Calculadora.this.menosesqActionPerformed(evt);
/*      */       }
/*      */       
/*  205 */     });
/*  206 */     this.contesq.setColumns(2);
/*  207 */     this.contesq.setEditable(false);
/*  208 */     this.contesq.setText("0");
/*  209 */     this.contesq.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  211 */         Calculadora.this.contesqActionPerformed(evt);
/*      */       }
/*      */       
/*  214 */     });
/*  215 */     this.contplac.setColumns(2);
/*  216 */     this.contplac.setEditable(false);
/*  217 */     this.contplac.setText("0");
/*  218 */     this.contplac.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  220 */         Calculadora.this.contplacActionPerformed(evt);
/*      */       }
/*      */       
/*  223 */     });
/*  224 */     this.menosplac.setText("-");
/*  225 */     this.menosplac.setEnabled(false);
/*  226 */     this.menosplac.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  228 */         Calculadora.this.menosplacActionPerformed(evt);
/*      */       }
/*      */       
/*  231 */     });
/*  232 */     this.masplac.setText("+");
/*  233 */     this.masplac.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  235 */         Calculadora.this.masplacActionPerformed(evt);
/*      */       }
/*      */       
/*  238 */     });
/*  239 */     this.pms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PM.png")));
/*  240 */     this.pms.setText("Puntos de Movimiento");
/*  241 */     this.pms.setToolTipText("1pm por 100 puntos\n1pm por 150 puntos");
/*      */     
/*  243 */     this.contpm.setColumns(2);
/*  244 */     this.contpm.setEditable(false);
/*  245 */     this.contpm.setText("0");
/*  246 */     this.contpm.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  248 */         Calculadora.this.contpmActionPerformed(evt);
/*      */       }
/*      */       
/*  251 */     });
/*  252 */     this.maspa.setText("+");
/*  253 */     this.maspa.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  255 */         Calculadora.this.maspaActionPerformed(evt);
/*      */       }
/*      */       
/*  258 */     });
/*  259 */     this.pas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PA.png")));
/*  260 */     this.pas.setText("Puntos de Accion");
/*  261 */     this.pas.setToolTipText("1pa por 150puntos nivel 1\n1pa por 250puntos nivel 2\n");
/*      */     
/*  263 */     this.menospm.setText("-");
/*  264 */     this.menospm.setEnabled(false);
/*  265 */     this.menospm.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  267 */         Calculadora.this.menospmActionPerformed(evt);
/*      */       }
/*      */       
/*  270 */     });
/*  271 */     this.instruccionmilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/InstMil.png")));
/*  272 */     this.instruccionmilitar.setText("instruccion militar");
/*  273 */     this.instruccionmilitar.setToolTipText("1 nivel por 10 puntos 0/10");
/*      */     
/*  275 */     this.maspm.setText("+");
/*  276 */     this.maspm.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  278 */         Calculadora.this.maspmActionPerformed(evt);
/*      */       }
/*      */       
/*  281 */     });
/*  282 */     this.mascrit.setText("+");
/*  283 */     this.mascrit.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  285 */         Calculadora.this.mascritActionPerformed(evt);
/*      */       }
/*      */       
/*  288 */     });
/*  289 */     this.criticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/crit.png")));
/*  290 */     this.criticos.setText("Golpes Criticos");
/*  291 */     this.criticos.setToolTipText("1% GC por 15 puntos 22");
/*      */     
/*  293 */     this.menospa.setText("-");
/*  294 */     this.menospa.setEnabled(false);
/*  295 */     this.menospa.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  297 */         Calculadora.this.menospaActionPerformed(evt);
/*      */       }
/*      */       
/*  300 */     });
/*  301 */     this.contcrit.setColumns(2);
/*  302 */     this.contcrit.setEditable(false);
/*  303 */     this.contcrit.setText("0");
/*  304 */     this.contcrit.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  306 */         Calculadora.this.contcritActionPerformed(evt);
/*      */       }
/*      */       
/*  309 */     });
/*  310 */     this.masini.setText("+");
/*  311 */     this.masini.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  313 */         Calculadora.this.masiniActionPerformed(evt);
/*      */       }
/*      */       
/*  316 */     });
/*  317 */     this.Placaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Plac.png")));
/*  318 */     this.Placaje.setText("Placaje");
/*  319 */     this.Placaje.setToolTipText("0.5% de placaje por 2 puntos");
/*      */     
/*  321 */     this.masins.setText("+");
/*  322 */     this.masins.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  324 */         Calculadora.this.masinsActionPerformed(evt);
/*      */       }
/*      */       
/*  327 */     });
/*  328 */     this.menosins.setText("-");
/*  329 */     this.menosins.setEnabled(false);
/*  330 */     this.menosins.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  332 */         Calculadora.this.menosinsActionPerformed(evt);
/*      */       }
/*      */       
/*  335 */     });
/*  336 */     this.contpa.setColumns(2);
/*  337 */     this.contpa.setEditable(false);
/*  338 */     this.contpa.setText("0");
/*  339 */     this.contpa.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  341 */         Calculadora.this.contpaActionPerformed(evt);
/*      */       }
/*      */       
/*  344 */     });
/*  345 */     this.contins.setColumns(2);
/*  346 */     this.contins.setEditable(false);
/*  347 */     this.contins.setText("0");
/*  348 */     this.contins.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  350 */         Calculadora.this.continsActionPerformed(evt);
/*      */       }
/*      */       
/*  353 */     });
/*  354 */     this.menoscrit.setText("-");
/*  355 */     this.menoscrit.setEnabled(false);
/*  356 */     this.menoscrit.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  358 */         Calculadora.this.menoscritActionPerformed(evt);
/*      */       }
/*      */       
/*  361 */     });
/*  362 */     this.contfuerza.setColumns(2);
/*  363 */     this.contfuerza.setEditable(false);
/*  364 */     this.contfuerza.setText("0");
/*  365 */     this.contfuerza.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  367 */         Calculadora.this.contfuerzaActionPerformed(evt);
/*      */       }
/*      */       
/*  370 */     });
/*  371 */     this.fuerzaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fuerza.png")));
/*  372 */     this.fuerzaicon.setText("Fuerza");
/*  373 */     this.fuerzaicon.setToolTipText("0.5% de daños y resistencia tierra por 3 puntos 250");
/*      */     
/*  375 */     this.agiicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Agi.png")));
/*  376 */     this.agiicon.setText("Agilidad");
/*  377 */     this.agiicon.setToolTipText("0.5% de daños y resistencia aire por 3 puntos");
/*      */     
/*  379 */     this.masagi.setText("+");
/*  380 */     this.masagi.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  382 */         Calculadora.this.masagiActionPerformed(evt);
/*      */       }
/*      */       
/*  385 */     });
/*  386 */     this.menosagi.setText("-");
/*  387 */     this.menosagi.setEnabled(false);
/*  388 */     this.menosagi.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  390 */         Calculadora.this.menosagiActionPerformed(evt);
/*      */       }
/*      */       
/*  393 */     });
/*  394 */     this.menosfuerza.setText("-");
/*  395 */     this.menosfuerza.setEnabled(false);
/*  396 */     this.menosfuerza.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  398 */         Calculadora.this.menosfuerzaActionPerformed(evt);
/*      */       }
/*      */       
/*  401 */     });
/*  402 */     this.masfuerza.setText("+");
/*  403 */     this.masfuerza.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  405 */         Calculadora.this.masfuerzaActionPerformed(evt);
/*      */       }
/*      */       
/*  408 */     });
/*  409 */     this.contagi.setColumns(2);
/*  410 */     this.contagi.setEditable(false);
/*  411 */     this.contagi.setText("0");
/*  412 */     this.contagi.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  414 */         Calculadora.this.contagiActionPerformed(evt);
/*      */       }
/*      */       
/*  417 */     });
/*  418 */     this.contsuer.setColumns(2);
/*  419 */     this.contsuer.setEditable(false);
/*  420 */     this.contsuer.setText("0");
/*  421 */     this.contsuer.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  423 */         Calculadora.this.contsuerActionPerformed(evt);
/*      */       }
/*      */       
/*  426 */     });
/*  427 */     this.masinte.setText("+");
/*  428 */     this.masinte.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  430 */         Calculadora.this.masinteActionPerformed(evt);
/*      */       }
/*      */       
/*  433 */     });
/*  434 */     this.menosinte.setText("-");
/*  435 */     this.menosinte.setEnabled(false);
/*  436 */     this.menosinte.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  438 */         Calculadora.this.menosinteActionPerformed(evt);
/*      */       }
/*      */       
/*  441 */     });
/*  442 */     this.menossuer.setText("-");
/*  443 */     this.menossuer.setEnabled(false);
/*  444 */     this.menossuer.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  446 */         Calculadora.this.menossuerActionPerformed(evt);
/*      */       }
/*      */       
/*  449 */     });
/*  450 */     this.massuer.setText("+");
/*  451 */     this.massuer.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  453 */         Calculadora.this.massuerActionPerformed(evt);
/*      */       }
/*      */       
/*  456 */     });
/*  457 */     this.luckicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suerte.png")));
/*  458 */     this.luckicon.setText("Suerte");
/*  459 */     this.luckicon.setToolTipText("0.5% de daños y resistencia agua por 3 puntos");
/*      */     
/*  461 */     this.inteicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/int.png")));
/*  462 */     this.inteicon.setText("Inteligencia");
/*  463 */     this.inteicon.setToolTipText("0.5% de daños y resistencia fuego por 3 puntos");
/*      */     
/*  465 */     this.continte.setColumns(2);
/*  466 */     this.continte.setEditable(false);
/*  467 */     this.continte.setText("0");
/*  468 */     this.continte.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  470 */         Calculadora.this.continteActionPerformed(evt);
/*      */       }
/*      */       
/*  473 */     });
/*  474 */     this.contperc.setColumns(2);
/*  475 */     this.contperc.setEditable(false);
/*  476 */     this.contperc.setText("0");
/*  477 */     this.contperc.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  479 */         Calculadora.this.contpercActionPerformed(evt);
/*      */       }
/*      */       
/*  482 */     });
/*  483 */     this.masvol.setText("+");
/*  484 */     this.masvol.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  486 */         Calculadora.this.masvolActionPerformed(evt);
/*      */       }
/*      */       
/*  489 */     });
/*  490 */     this.menosvol.setText("-");
/*  491 */     this.menosvol.setEnabled(false);
/*  492 */     this.menosvol.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  494 */         Calculadora.this.menosvolActionPerformed(evt);
/*      */       }
/*      */       
/*  497 */     });
/*  498 */     this.menosperc.setText("-");
/*  499 */     this.menosperc.setEnabled(false);
/*  500 */     this.menosperc.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  502 */         Calculadora.this.menospercActionPerformed(evt);
/*      */       }
/*      */       
/*  505 */     });
/*  506 */     this.masperc.setText("+");
/*  507 */     this.masperc.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  509 */         Calculadora.this.maspercActionPerformed(evt);
/*      */       }
/*      */       
/*  512 */     });
/*  513 */     this.percepicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Percep.png")));
/*  514 */     this.percepicon.setText("Percepción");
/*  515 */     this.percepicon.setToolTipText("+1 percepcion por 1 punto 100");
/*      */     
/*  517 */     this.voluntadicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vol.png")));
/*  518 */     this.voluntadicon.setText("Voluntad");
/*  519 */     this.voluntadicon.setToolTipText("+1 de voluntad por 10 puntos 50\n\ncada nivel impar +1 atkpa cada par +1 defpa");
/*      */     
/*  521 */     this.contvol.setColumns(2);
/*  522 */     this.contvol.setEditable(false);
/*  523 */     this.contvol.setText("0");
/*  524 */     this.contvol.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  526 */         Calculadora.this.contvolActionPerformed(evt);
/*      */       }
/*      */       
/*  529 */     });
/*  530 */     this.contant.setColumns(2);
/*  531 */     this.contant.setEditable(false);
/*  532 */     this.contant.setText("0");
/*  533 */     this.contant.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  535 */         Calculadora.this.contantActionPerformed(evt);
/*      */       }
/*      */       
/*  538 */     });
/*  539 */     this.menosant.setText("-");
/*  540 */     this.menosant.setEnabled(false);
/*  541 */     this.menosant.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  543 */         Calculadora.this.menosantActionPerformed(evt);
/*      */       }
/*      */       
/*  546 */     });
/*  547 */     this.masant.setText("+");
/*  548 */     this.masant.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  550 */         Calculadora.this.masantActionPerformed(evt);
/*      */       }
/*      */       
/*  553 */     });
/*  554 */     this.anticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Anticip.png")));
/*  555 */     this.anticon.setText("Anticipación");
/*  556 */     this.anticon.setToolTipText("1% de anticipacion por  9 puntos 25");
/*      */     
/*  558 */     this.pms4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/alc.png")));
/*  559 */     this.pms4.setText("Alcance");
/*  560 */     this.pms4.setToolTipText("+1 alcance por 80 puntos");
/*      */     
/*  562 */     this.masmenosalcance.setText("+1 (tiene un limite de 1) ;D");
/*  563 */     this.masmenosalcance.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  565 */         Calculadora.this.masmenosalcanceActionPerformed(evt);
/*      */       }
/*      */       
/*  568 */     });
/*  569 */     GroupLayout jInternalFrame1Layout = new GroupLayout(this.jInternalFrame1.getContentPane());
/*  570 */     this.jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
/*  571 */     jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(14, 14, 14).add(jInternalFrame1Layout.createParallelGroup(1).add(this.pms4).add(jInternalFrame1Layout.createSequentialGroup().add(this.masmenosalcance).add(71, 71, 71).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosant, -2, 40, -2).add(6, 6, 6).add(this.contant, -2, 54, -2).add(12, 12, 12).add(this.masant, -2, 45, -2)).add(this.anticon))).add(this.inteicon).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosinte, -2, 40, -2).add(6, 6, 6).add(this.continte, -2, 54, -2).add(5, 5, 5).add(this.masinte, -2, 45, -2)).add(this.fuerzaicon).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosfuerza, -2, 40, -2).add(6, 6, 6).add(this.contfuerza, -2, 54, -2).addPreferredGap(0).add(this.masfuerza, -2, 45, -2)).add(jInternalFrame1Layout.createParallelGroup(2).add(jInternalFrame1Layout.createParallelGroup(1).add(this.voluntadicon).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosvol, -2, 40, -2).add(6, 6, 6).add(this.contvol, -2, 54, -2).add(5, 5, 5).add(this.masvol, -2, 45, -2)).add(jInternalFrame1Layout.createSequentialGroup().add(273, 273, 273).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosperc, -2, 40, -2).addPreferredGap(0).add(this.contperc, -2, 60, -2).addPreferredGap(0).add(this.masperc, -2, 45, -2)).add(this.percepicon)))).add(jInternalFrame1Layout.createSequentialGroup().add(273, 273, 273).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.menossuer, -2, 40, -2).addPreferredGap(0).add(this.contsuer, -2, 60, -2).addPreferredGap(0).add(this.massuer, -2, 45, -2)).add(this.luckicon)))).add(jInternalFrame1Layout.createSequentialGroup().add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(46, 46, 46).add(this.contpdv, -2, 54, -2)).add(this.menospdv, -2, 41, -2)).add(6, 6, 6).add(this.maspdv, -2, 49, -2)).add(this.puntosdevida, -2, 136, -2).add(this.esquiva).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosesq, -2, 40, -2).add(5, 5, 5).add(this.contesq, -2, 54, -2).add(5, 5, 5).add(this.masesq, -2, 45, -2)).add(this.menosins, -2, 41, -2).add(jInternalFrame1Layout.createSequentialGroup().add(46, 46, 46).add(this.contins, -2, 54, -2)).add(jInternalFrame1Layout.createSequentialGroup().add(105, 105, 105).add(this.masins, -2, 40, -2)).add(this.pms).add(this.instruccionmilitar, -2, 160, -2).add(jInternalFrame1Layout.createSequentialGroup().add(this.menospm, -2, 40, -2).add(6, 6, 6).add(this.contpm, -2, 54, -2).add(5, 5, 5).add(this.maspm, -2, 45, -2))).add(100, 100, 100).add(jInternalFrame1Layout.createParallelGroup(1, false).add(jInternalFrame1Layout.createSequentialGroup().add(this.menoscrit, -2, 40, -2).addPreferredGap(0).add(this.contcrit, -2, 60, -2).addPreferredGap(0).add(this.mascrit, -2, 45, -2)).add(this.Placaje).add(this.iniciativa, -2, 98, -2).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosini, -2, 40, -2).addPreferredGap(0).add(this.contini, -2, 60, -2).addPreferredGap(0).add(this.masini, -2, 45, -2)).add(this.pas).add(this.criticos, -2, 142, -2).add(jInternalFrame1Layout.createParallelGroup(2).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosagi, -2, 40, -2).addPreferredGap(0).add(this.contagi, -2, 60, -2).addPreferredGap(0).add(this.masagi, -2, 45, -2)).add(this.agiicon)).add(jInternalFrame1Layout.createSequentialGroup().add(this.menospa, -2, 40, -2).addPreferredGap(0).add(this.contpa, -2, 60, -2).addPreferredGap(0).add(this.maspa, -2, 45, -2))).add(jInternalFrame1Layout.createSequentialGroup().add(this.menosplac, -2, 40, -2).addPreferredGap(0).add(this.contplac, -2, 60, -2).addPreferredGap(0).add(this.masplac, -2, 1, 32767))))).add(20, 20, 20)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  705 */     jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(16, 16, 16).add(jInternalFrame1Layout.createParallelGroup(3).add(this.puntosdevida, -2, 30, -2).add(this.iniciativa)).addPreferredGap(1).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(jInternalFrame1Layout.createParallelGroup(1).add(this.contpdv, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(this.menospdv)).add(this.maspdv)).addPreferredGap(0).add(this.esquiva)).add(jInternalFrame1Layout.createSequentialGroup().add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createParallelGroup(3).add(this.contini, -2, -1, -2).add(this.masini)).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(this.menosini))).addPreferredGap(0).add(this.Placaje))).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(4, 4, 4).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contesq, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosesq).add(this.masesq)))).addPreferredGap(0).add(this.instruccionmilitar, -2, 30, -2).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contins, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosins).add(this.masins))))).add(jInternalFrame1Layout.createSequentialGroup().addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createParallelGroup(3).add(this.contplac, -2, -1, -2).add(this.masplac)).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(this.menosplac))).add(5, 5, 5).add(this.criticos).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contcrit, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menoscrit).add(this.mascrit)))))).addPreferredGap(1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.pms).add(this.pas)).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(8, 8, 8).add(this.menospm)).add(jInternalFrame1Layout.createSequentialGroup().add(8, 8, 8).add(this.contpm, -2, -1, -2)).add(jInternalFrame1Layout.createSequentialGroup().add(8, 8, 8).add(this.maspm)).add(jInternalFrame1Layout.createSequentialGroup().addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contpa, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menospa).add(this.maspa)))))).addPreferredGap(1).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.fuerzaicon).add(8, 8, 8).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosfuerza).add(jInternalFrame1Layout.createParallelGroup(3).add(this.contfuerza, -2, -1, -2).add(this.masfuerza)))).add(jInternalFrame1Layout.createSequentialGroup().add(this.agiicon).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contagi, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosagi).add(this.masagi)))))).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.inteicon).add(8, 8, 8).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosinte).add(this.continte, -2, -1, -2).add(this.masinte))).add(jInternalFrame1Layout.createSequentialGroup().add(this.luckicon).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contsuer, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menossuer).add(this.massuer)))))).add(18, 18, 18).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.voluntadicon).add(8, 8, 8).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosvol).add(this.contvol, -2, -1, -2).add(this.masvol))).add(jInternalFrame1Layout.createSequentialGroup().add(this.percepicon).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contperc, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosperc).add(this.masperc)))))).add(18, 18, 18).add(jInternalFrame1Layout.createParallelGroup(1).add(jInternalFrame1Layout.createSequentialGroup().add(this.pms4).addPreferredGap(1).add(this.masmenosalcance)).add(jInternalFrame1Layout.createSequentialGroup().add(this.anticon).addPreferredGap(0).add(jInternalFrame1Layout.createParallelGroup(1).add(this.contant, -2, -1, -2).add(jInternalFrame1Layout.createSequentialGroup().add(1, 1, 1).add(jInternalFrame1Layout.createParallelGroup(1).add(this.menosant).add(this.masant)))))).addContainerGap(81, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  872 */     this.pms.getAccessibleContext().setAccessibleDescription("1pm por 100 puntos 1/2\n1pm por 150 puntos 2/2");
/*  873 */     this.instruccionmilitar.getAccessibleContext().setAccessibleDescription("1 nivel por 10 puntos 1/10");
/*  874 */     this.criticos.getAccessibleContext().setAccessibleDescription("1% GC por 15 puntos 0/22");
/*  875 */     this.percepicon.getAccessibleContext().setAccessibleDescription("+1 percepcion por 1 punto 0/100");
/*  876 */     this.voluntadicon.getAccessibleContext().setAccessibleDescription("+1 de voluntad por 10 puntos 0/50");
/*  877 */     this.anticon.getAccessibleContext().setAccessibleDescription("1% de anticipacion por  9 puntos 0/25");
/*  878 */     this.pms4.getAccessibleContext().setAccessibleDescription("+1 alcance por 80 puntos 1");
/*      */     
/*  880 */     this.jInternalFrame2.setTitle("Estado");
/*  881 */     this.jInternalFrame2.setVisible(true);
/*      */     
/*  883 */     this.jLabel2.setText("Puntos usados");
/*      */     
/*  885 */     this.puntosusados.setEditable(false);
/*  886 */     this.puntosusados.setHorizontalAlignment(0);
/*  887 */     this.puntosusados.setText("0");
/*  888 */     this.puntosusados.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  890 */         Calculadora.this.puntosusadosActionPerformed(evt);
/*      */       }
/*      */       
/*  893 */     });
/*  894 */     this.jLabel1.setText("Nivel");
/*      */     
/*  896 */     this.NivelActual.setText("1");
/*  897 */     this.NivelActual.setToolTipText("Coloca tu nivel actual aqui");
/*      */     
/*  899 */     this.PonerNivel.setText("Ok");
/*  900 */     this.PonerNivel.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  902 */         Calculadora.this.PonerNivelActionPerformed(evt);
/*      */       }
/*      */       
/*  905 */     });
/*  906 */     this.PuntosActuales.setEditable(false);
/*  907 */     this.PuntosActuales.setText("0");
/*      */     
/*  909 */     this.jLabel3.setText("puntos");
/*      */     
/*  911 */     this.jLabel4.setText("Puntos Restantes");
/*      */     
/*  913 */     this.PuntosRestantes.setText("0");
/*      */     
/*  915 */     GroupLayout jInternalFrame2Layout = new GroupLayout(this.jInternalFrame2.getContentPane());
/*  916 */     this.jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
/*  917 */     jInternalFrame2Layout.setHorizontalGroup(jInternalFrame2Layout.createParallelGroup(1).add(jInternalFrame2Layout.createSequentialGroup().add(jInternalFrame2Layout.createParallelGroup(1).add(jInternalFrame2Layout.createSequentialGroup().add(19, 19, 19).add(this.jLabel1).addPreferredGap(0).add(jInternalFrame2Layout.createParallelGroup(1).add(jInternalFrame2Layout.createSequentialGroup().add(this.NivelActual, -2, 53, -2).addPreferredGap(0).add(this.PonerNivel, -2, 56, -2)).add(jInternalFrame2Layout.createSequentialGroup().add(this.PuntosActuales, -2, 68, -2).addPreferredGap(0).add(jInternalFrame2Layout.createParallelGroup(1).add(this.jLabel4).add(this.jLabel3).add(jInternalFrame2Layout.createSequentialGroup().add(22, 22, 22).add(this.PuntosRestantes, -2, 68, -2)))))).add(jInternalFrame2Layout.createSequentialGroup().addContainerGap().add(this.jLabel2)).add(jInternalFrame2Layout.createSequentialGroup().add(23, 23, 23).add(this.puntosusados, -2, 48, -2))).addContainerGap(18, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  947 */     jInternalFrame2Layout.setVerticalGroup(jInternalFrame2Layout.createParallelGroup(1).add(2, jInternalFrame2Layout.createSequentialGroup().addContainerGap().add(jInternalFrame2Layout.createParallelGroup(3).add(this.jLabel1).add(this.NivelActual, -2, -1, -2).add(this.PonerNivel)).addPreferredGap(0).add(jInternalFrame2Layout.createParallelGroup(3).add(this.PuntosActuales, -2, -1, -2).add(this.jLabel3)).add(18, 18, 18).add(jInternalFrame2Layout.createParallelGroup(3).add(this.jLabel2).add(this.jLabel4)).addPreferredGap(0).add(jInternalFrame2Layout.createParallelGroup(3).add(this.puntosusados, -2, -1, -2).add(this.PuntosRestantes, -2, -1, -2)).addContainerGap(7, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  970 */     this.jInternalFrame3.setTitle("Dominios");
/*  971 */     this.jInternalFrame3.setVisible(true);
/*      */     
/*  973 */     this.jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agua.png")));
/*  974 */     this.jLabel5.setText("agua");
/*      */     
/*  976 */     this.jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aire.png")));
/*  977 */     this.jLabel6.setText("agua");
/*      */     
/*  979 */     this.jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fuego.png")));
/*  980 */     this.jLabel7.setText("agua");
/*      */     
/*  982 */     this.jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tierra.png")));
/*  983 */     this.jLabel8.setText("agua");
/*      */     
/*  985 */     this.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*      */     
/*  987 */     this.jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*      */     
/*  989 */     this.jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*      */     
/*  991 */     this.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*      */     
/*  993 */     this.jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*      */     
/*  995 */     this.jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dompa.png")));
/*  996 */     this.jLabel14.setText("agua");
/*      */     
/*  998 */     this.jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resis.png")));
/*  999 */     this.jLabel15.setEnabled(false);
/*      */     
/* 1001 */     this.jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dompm.png")));
/* 1002 */     this.jLabel16.setText("agua");
/* 1003 */     this.jLabel16.setEnabled(false);
/*      */     
/* 1005 */     this.atkagua.setEditable(false);
/* 1006 */     this.atkagua.setText("0");
/*      */     
/* 1008 */     this.atkaire.setEditable(false);
/* 1009 */     this.atkaire.setText("0");
/*      */     
/* 1011 */     this.atkfuego.setEditable(false);
/* 1012 */     this.atkfuego.setText("0");
/* 1013 */     this.atkfuego.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1015 */         Calculadora.this.atkfuegoActionPerformed(evt);
/*      */       }
/*      */       
/* 1018 */     });
/* 1019 */     this.atktierra.setEditable(false);
/* 1020 */     this.atktierra.setText("0");
/*      */     
/* 1022 */     this.quitapa.setEditable(false);
/* 1023 */     this.quitapa.setText("0");
/*      */     
/* 1025 */     this.quitapm.setEditable(false);
/* 1026 */     this.quitapm.setText("0");
/* 1027 */     this.quitapm.setEnabled(false);
/*      */     
/* 1029 */     this.defagua.setEditable(false);
/* 1030 */     this.defagua.setText("0");
/*      */     
/* 1032 */     this.defaire.setEditable(false);
/* 1033 */     this.defaire.setText("0");
/*      */     
/* 1035 */     this.deffuego.setEditable(false);
/* 1036 */     this.deffuego.setText("0");
/*      */     
/* 1038 */     this.deftierra.setEditable(false);
/* 1039 */     this.deftierra.setText("0");
/*      */     
/* 1041 */     this.defpa.setEditable(false);
/* 1042 */     this.defpa.setText("0");
/*      */     
/* 1044 */     this.defpm.setEditable(false);
/* 1045 */     this.defpm.setText("0");
/* 1046 */     this.defpm.setEnabled(false);
/*      */     
/* 1048 */     GroupLayout jInternalFrame3Layout = new GroupLayout(this.jInternalFrame3.getContentPane());
/* 1049 */     this.jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
/* 1050 */     jInternalFrame3Layout.setHorizontalGroup(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().addContainerGap().add(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel16, -2, 58, -2).addPreferredGap(1).add(this.quitapm, -2, 59, -2).add(25, 25, 25).add(this.jLabel15).addPreferredGap(1).add(this.defpm, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel14, -2, 58, -2).addPreferredGap(1).add(this.quitapa, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel6, -2, 58, -2).addPreferredGap(1).add(this.atkaire, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel7, -2, 58, -2).addPreferredGap(1).add(this.atkfuego, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel8, -2, 58, -2).addPreferredGap(1).add(this.atktierra, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel5, -2, 58, -2).addPreferredGap(1).add(this.atkagua, -2, 59, -2))).add(25, 25, 25).add(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel12).addPreferredGap(1).add(this.deftierra, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel11).addPreferredGap(1).add(this.deffuego, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel10).addPreferredGap(1).add(this.defaire, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel9).addPreferredGap(1).add(this.defagua, -2, 59, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel13).addPreferredGap(1).add(this.defpa, -2, 59, -2))))).addContainerGap(132, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1109 */     jInternalFrame3Layout.setVerticalGroup(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().addContainerGap().add(jInternalFrame3Layout.createParallelGroup(1, false).add(jInternalFrame3Layout.createSequentialGroup().add(this.defagua, -2, -1, -2).addPreferredGap(0, -1, 32767).add(this.defaire, -2, -1, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(jInternalFrame3Layout.createParallelGroup(1).add(this.jLabel9).add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel5).add(this.atkagua, -2, -1, -2))).addPreferredGap(1).add(jInternalFrame3Layout.createParallelGroup(2).add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel6).add(this.atkaire, -2, -1, -2)).add(this.jLabel10)))).addPreferredGap(1).add(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel7).add(this.atkfuego, -2, -1, -2)).addPreferredGap(1).add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel8).add(this.atktierra, -2, -1, -2))).add(jInternalFrame3Layout.createParallelGroup(2, false).add(jInternalFrame3Layout.createSequentialGroup().add(this.deffuego, -2, -1, -2).addPreferredGap(0, -1, 32767).add(this.deftierra, -2, -1, -2)).add(jInternalFrame3Layout.createSequentialGroup().add(this.jLabel11).addPreferredGap(0).add(this.jLabel12)))).addPreferredGap(0).add(jInternalFrame3Layout.createParallelGroup(1).add(jInternalFrame3Layout.createSequentialGroup().add(3, 3, 3).add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel14).add(this.quitapa, -2, -1, -2))).add(this.jLabel13).add(this.defpa, -2, -1, -2)).addPreferredGap(0).add(jInternalFrame3Layout.createParallelGroup(1).add(this.defpm, -2, -1, -2).add(jInternalFrame3Layout.createSequentialGroup().add(3, 3, 3).add(jInternalFrame3Layout.createParallelGroup(3).add(this.jLabel16).add(this.quitapm, -2, -1, -2))).add(this.jLabel15)).addContainerGap(35, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1170 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1171 */     getContentPane().setLayout(layout);
/* 1172 */     layout.setHorizontalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(1).add(this.jInternalFrame3, -2, -1, -2).add(layout.createSequentialGroup().add(22, 22, 22).add(this.jInternalFrame2, -2, -1, -2))).addPreferredGap(0).add(this.jInternalFrame1, -2, -1, -2).addContainerGap(108, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1185 */     layout.setVerticalGroup(layout.createParallelGroup(1).add(2, layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(2).add(layout.createSequentialGroup().add(this.jInternalFrame1).addContainerGap()).add(layout.createSequentialGroup().add(this.jInternalFrame2, -2, -1, -2).addPreferredGap(0, -1, 32767).add(this.jInternalFrame3, -2, -1, -2).add(21, 21, 21)))));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1200 */     getAccessibleContext().setAccessibleName("Calculadora Wakfu");
/* 1201 */     getAccessibleContext().setAccessibleDescription("Calculadora Wakfu");
/*      */     
/* 1203 */     pack(); }
/*      */   
/*      */   private JTextField contins;
/*      */   
/* 1207 */   public int Actualizar(int usado, int sobrante) { this.usedpoints += usado;
/* 1208 */     this.restpoints += sobrante;
/* 1209 */     this.puntosusados.setText(String.valueOf(this.usedpoints));
/* 1210 */     this.PuntosRestantes.setText(String.valueOf(this.restpoints));
/* 1211 */     return 1; }
/*      */   private JTextField continte;
/*      */   
/* 1214 */   private void maspdvActionPerformed(ActionEvent evt) { int pdv = Integer.parseInt(this.contpdv.getText());
/* 1215 */     pdv++;
/* 1216 */     if (!this.menospdv.isEnabled()) {
/* 1217 */       this.menospdv.setEnabled(true);
/*      */     }
/* 1219 */     this.contpdv.setText(String.valueOf(pdv));
/*      */     
/* 1221 */     Actualizar(1, -1); }
/*      */   
/*      */   private JTextField contpa;
/*      */   
/* 1225 */   private void menospdvActionPerformed(ActionEvent evt) { int pdv = Integer.parseInt(this.contpdv.getText());
/* 1226 */     Actualizar(-1, 1);
/* 1227 */     pdv--;
/*      */     
/* 1229 */     if (pdv == 0) {
/* 1230 */       this.menospdv.setEnabled(false);
/*      */     }
/*      */     
/* 1233 */     this.contpdv.setText(String.valueOf(pdv)); }
/*      */   
/*      */   private JTextField contpdv;
/*      */   private JTextField contperc;
/*      */   private JTextField contplac;
/*      */   
/*      */   private void contpdvActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void puntosusadosActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void continiActionPerformed(ActionEvent evt) {}
/*      */   private JTextField contpm;
/*      */   private JTextField contsuer;
/*      */   private JTextField contvol;
/*      */   private JLabel criticos;
/*      */   private JTextField defagua;
/*      */   
/* 1250 */   private void menosiniActionPerformed(ActionEvent evt) { int ini = Integer.parseInt(this.contini.getText());
/* 1251 */     Actualizar(-2, 2);
/* 1252 */     ini--;
/* 1253 */     if (ini == 0) {
/* 1254 */       this.menosini.setEnabled(false);
/*      */     }
/*      */     
/* 1257 */     this.contini.setText(String.valueOf(ini)); }
/*      */   
/*      */   private JTextField defaire;
/*      */   private JTextField deffuego;
/*      */   
/* 1262 */   private void PonerNivelActionPerformed(ActionEvent evt) { int nivel = Integer.parseInt(this.NivelActual.getText());
/* 1263 */     nivel = (nivel - 1) * 5;
/* 1264 */     this.PuntosActuales.setText(String.valueOf(nivel));
/* 1265 */     this.PuntosRestantes.setText(String.valueOf(nivel));
/* 1266 */     this.restpoints = nivel;
/*      */   }
/*      */   
/*      */   private JTextField defpa;
/*      */   private JTextField defpm;
/*      */   private JTextField deftierra;
/*      */   private JLabel esquiva;
/*      */   private JLabel fuerzaicon;
/*      */   
/*      */   private void masesqActionPerformed(ActionEvent evt) {
/* 1276 */     int esq = Integer.parseInt(this.contesq.getText());
/* 1277 */     esq++;
/* 1278 */     if (!this.menosesq.isEnabled()) {
/* 1279 */       this.menosesq.setEnabled(true);
/*      */     }
/* 1281 */     this.contesq.setText(String.valueOf(esq));
/* 1282 */     Actualizar(2, -2); }
/*      */   
/*      */   private JLabel iniciativa;
/*      */   
/* 1286 */   private void menosesqActionPerformed(ActionEvent evt) { int esq = Integer.parseInt(this.contesq.getText());
/* 1287 */     Actualizar(-2, 2);
/* 1288 */     esq--;
/* 1289 */     if (esq == 0) {
/* 1290 */       this.menosesq.setEnabled(false);
/*      */     }
/*      */     
/* 1293 */     this.contesq.setText(String.valueOf(esq));
/*      */   }
/*      */   
/*      */   private JLabel instruccionmilitar;
/*      */   private JLabel inteicon;
/*      */   private javax.swing.JInternalFrame jInternalFrame1;
/*      */   private void contesqActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void contplacActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void menosplacActionPerformed(ActionEvent evt)
/*      */   {
/* 1305 */     int plac = Integer.parseInt(this.contplac.getText());
/* 1306 */     Actualizar(-2, 2);
/* 1307 */     plac--;
/* 1308 */     if (plac == 0) {
/* 1309 */       this.menosplac.setEnabled(false);
/*      */     }
/*      */     
/* 1312 */     this.contplac.setText(String.valueOf(plac));
/*      */   }
/*      */   
/*      */   private void masplacActionPerformed(ActionEvent evt) {
/* 1316 */     int plac = Integer.parseInt(this.contplac.getText());
/* 1317 */     plac++;
/* 1318 */     if (!this.menosplac.isEnabled()) {
/* 1319 */       this.menosplac.setEnabled(true);
/*      */     }
/* 1321 */     this.contplac.setText(String.valueOf(plac));
/* 1322 */     Actualizar(2, -2);
/*      */   }
/*      */   
/*      */ 
/*      */   private void contpmActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void maspaActionPerformed(ActionEvent evt)
/*      */   {
/* 1330 */     int pa = Integer.parseInt(this.contpa.getText());
/* 1331 */     pa++;
/* 1332 */     if (!this.menospa.isEnabled()) {
/* 1333 */       this.menospa.setEnabled(true);
/*      */     }
/* 1335 */     this.contpa.setText(String.valueOf(pa));
/*      */     
/* 1337 */     if (pa == 1) Actualizar(150, 65386);
/* 1338 */     if (pa == 2) { Actualizar(250, 65286);
/*      */     }
/* 1340 */     if (pa == 2) {
/* 1341 */       this.maspa.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menospmActionPerformed(ActionEvent evt)
/*      */   {
/* 1347 */     int pm = Integer.parseInt(this.contpm.getText());
/* 1348 */     pm--;
/* 1349 */     if (pm == 0) {
/* 1350 */       this.menospm.setEnabled(false);
/*      */     }
/*      */     
/* 1353 */     this.contpm.setText(String.valueOf(pm));
/* 1354 */     if (pm == 1) Actualizar(65386, 150);
/* 1355 */     if (pm == 0) { Actualizar(-100, 100);
/*      */     }
/* 1357 */     if (pm < 2) {
/* 1358 */       this.maspm.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void maspmActionPerformed(ActionEvent evt)
/*      */   {
/* 1364 */     int pm = Integer.parseInt(this.contpm.getText());
/* 1365 */     pm++;
/* 1366 */     if (!this.menospm.isEnabled()) {
/* 1367 */       this.menospm.setEnabled(true);
/*      */     }
/* 1369 */     this.contpm.setText(String.valueOf(pm));
/*      */     
/* 1371 */     if (pm == 1) Actualizar(100, -100);
/* 1372 */     if (pm == 2) { Actualizar(150, 65386);
/*      */     }
/* 1374 */     if (pm == 2) {
/* 1375 */       this.maspm.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void mascritActionPerformed(ActionEvent evt) {
/* 1380 */     int crit = Integer.parseInt(this.contcrit.getText());
/* 1381 */     crit++;
/* 1382 */     if (!this.menoscrit.isEnabled()) {
/* 1383 */       this.menoscrit.setEnabled(true);
/*      */     }
/* 1385 */     this.contcrit.setText(String.valueOf(crit));
/* 1386 */     Actualizar(15, -15);
/*      */     
/* 1388 */     if (crit == 22) {
/* 1389 */       this.mascrit.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menospaActionPerformed(ActionEvent evt) {
/* 1394 */     int pa = Integer.parseInt(this.contpa.getText());
/* 1395 */     pa--;
/* 1396 */     if (pa == 0) {
/* 1397 */       this.menospa.setEnabled(false);
/*      */     }
/*      */     
/* 1400 */     this.contpa.setText(String.valueOf(pa));
/* 1401 */     if (pa == 1) Actualizar(65286, 250);
/* 1402 */     if (pa == 0) { Actualizar(65386, 150);
/*      */     }
/* 1404 */     if (pa < 2) {
/* 1405 */       this.maspa.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void contcritActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void masiniActionPerformed(ActionEvent evt)
/*      */   {
/* 1415 */     int ini = Integer.parseInt(this.contini.getText());
/* 1416 */     ini++;
/* 1417 */     if (!this.menosini.isEnabled()) {
/* 1418 */       this.menosini.setEnabled(true);
/*      */     }
/* 1420 */     this.contini.setText(String.valueOf(ini));
/* 1421 */     Actualizar(2, -2);
/*      */   }
/*      */   
/*      */   private void masinsActionPerformed(ActionEvent evt) {
/* 1425 */     int ins = Integer.parseInt(this.contins.getText());
/* 1426 */     ins++;
/* 1427 */     if (!this.menosins.isEnabled()) {
/* 1428 */       this.menosins.setEnabled(true);
/*      */     }
/* 1430 */     this.contins.setText(String.valueOf(ins));
/* 1431 */     Actualizar(10, -10);
/*      */     
/* 1433 */     if (ins == 10) {
/* 1434 */       this.masins.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menosinsActionPerformed(ActionEvent evt) {
/* 1439 */     int ins = Integer.parseInt(this.contins.getText());
/* 1440 */     Actualizar(-10, 10);
/* 1441 */     ins--;
/* 1442 */     if (ins == 0) {
/* 1443 */       this.menosins.setEnabled(false);
/*      */     }
/*      */     
/* 1446 */     this.contins.setText(String.valueOf(ins));
/*      */     
/* 1448 */     if (ins < 10) {
/* 1449 */       this.masins.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void contpaActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void continsActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void menoscritActionPerformed(ActionEvent evt)
/*      */   {
/* 1462 */     int crit = Integer.parseInt(this.contcrit.getText());
/* 1463 */     Actualizar(-15, 15);
/* 1464 */     crit--;
/* 1465 */     if (crit == 0) {
/* 1466 */       this.menoscrit.setEnabled(false);
/*      */     }
/*      */     
/* 1469 */     this.contcrit.setText(String.valueOf(crit));
/*      */     
/* 1471 */     if (crit < 22) {
/* 1472 */       this.mascrit.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void contfuerzaActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void masagiActionPerformed(ActionEvent evt)
/*      */   {
/* 1481 */     int agilidad = Integer.parseInt(this.contagi.getText());
/*      */     
/* 1483 */     agilidad++;
/* 1484 */     if (!this.menosagi.isEnabled()) {
/* 1485 */       this.menosagi.setEnabled(true);
/*      */     }
/* 1487 */     this.contagi.setText(String.valueOf(agilidad));
/* 1488 */     Actualizar(3, -3);
/* 1489 */     float agi = agilidad * 0.5F;
/* 1490 */     this.atkaire.setText(String.valueOf(agi));
/* 1491 */     this.defaire.setText(String.valueOf(agi));
/*      */     
/* 1493 */     if (agilidad == 250) {
/* 1494 */       this.masagi.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menosagiActionPerformed(ActionEvent evt) {
/* 1499 */     int agilidad = Integer.parseInt(this.contagi.getText());
/*      */     
/* 1501 */     Actualizar(-3, 3);
/* 1502 */     agilidad--;
/* 1503 */     if (agilidad == 0) {
/* 1504 */       this.menosagi.setEnabled(false);
/*      */     }
/*      */     
/* 1507 */     this.contagi.setText(String.valueOf(agilidad));
/* 1508 */     float agi = agilidad * 0.5F;
/* 1509 */     this.atkaire.setText(String.valueOf(agi));
/* 1510 */     this.defaire.setText(String.valueOf(agi));
/*      */     
/* 1512 */     if (agilidad < 250) {
/* 1513 */       this.masagi.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menosfuerzaActionPerformed(ActionEvent evt) {
/* 1518 */     int fuerza = Integer.parseInt(this.contfuerza.getText());
/*      */     
/* 1520 */     Actualizar(-3, 3);
/* 1521 */     fuerza--;
/* 1522 */     if (fuerza == 0) {
/* 1523 */       this.menosfuerza.setEnabled(false);
/*      */     }
/*      */     
/* 1526 */     this.contfuerza.setText(String.valueOf(fuerza));
/* 1527 */     float str = fuerza * 0.5F;
/* 1528 */     this.atktierra.setText(String.valueOf(str));
/* 1529 */     this.deftierra.setText(String.valueOf(str));
/*      */     
/* 1531 */     if (fuerza < 250) {
/* 1532 */       this.masfuerza.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void masfuerzaActionPerformed(ActionEvent evt) {
/* 1537 */     int fuerza = Integer.parseInt(this.contfuerza.getText());
/*      */     
/* 1539 */     fuerza++;
/* 1540 */     if (!this.menosfuerza.isEnabled()) {
/* 1541 */       this.menosfuerza.setEnabled(true);
/*      */     }
/* 1543 */     this.contfuerza.setText(String.valueOf(fuerza));
/* 1544 */     Actualizar(3, -3);
/* 1545 */     float str = fuerza * 0.5F;
/* 1546 */     this.atktierra.setText(String.valueOf(str));
/* 1547 */     this.deftierra.setText(String.valueOf(str));
/*      */     
/* 1549 */     if (fuerza == 250)
/* 1550 */       this.masfuerza.setEnabled(false);
/*      */   }
/*      */   
/*      */   private javax.swing.JInternalFrame jInternalFrame2;
/*      */   private javax.swing.JInternalFrame jInternalFrame3;
/*      */   private JLabel jLabel1;
/*      */   private JLabel jLabel10;
/*      */   private JLabel jLabel11;
/*      */   
/*      */   private void contagiActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void contsuerActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void masinteActionPerformed(ActionEvent evt) {
/* 1564 */     int inteli = Integer.parseInt(this.continte.getText());
/*      */     
/* 1566 */     inteli++;
/* 1567 */     if (!this.menosinte.isEnabled()) {
/* 1568 */       this.menosinte.setEnabled(true);
/*      */     }
/* 1570 */     this.continte.setText(String.valueOf(inteli));
/* 1571 */     Actualizar(3, -3);
/* 1572 */     float inte = inteli * 0.5F;
/* 1573 */     this.atkfuego.setText(String.valueOf(inte));
/* 1574 */     this.deffuego.setText(String.valueOf(inte));
/*      */     
/* 1576 */     if (inteli == 250) {
/* 1577 */       this.masinte.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menosinteActionPerformed(ActionEvent evt) {
/* 1582 */     int inteli = Integer.parseInt(this.continte.getText());
/*      */     
/* 1584 */     Actualizar(-3, 3);
/* 1585 */     inteli--;
/* 1586 */     if (inteli == 0) {
/* 1587 */       this.menosinte.setEnabled(false);
/*      */     }
/*      */     
/* 1590 */     this.continte.setText(String.valueOf(inteli));
/* 1591 */     float inte = inteli * 0.5F;
/* 1592 */     this.atkfuego.setText(String.valueOf(inte));
/* 1593 */     this.deffuego.setText(String.valueOf(inte));
/*      */     
/* 1595 */     if (inteli < 250) {
/* 1596 */       this.masinte.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menossuerActionPerformed(ActionEvent evt) {
/* 1601 */     int suerte = Integer.parseInt(this.contsuer.getText());
/*      */     
/* 1603 */     Actualizar(-3, 3);
/* 1604 */     suerte--;
/* 1605 */     if (suerte == 0) {
/* 1606 */       this.menossuer.setEnabled(false);
/*      */     }
/*      */     
/* 1609 */     this.contsuer.setText(String.valueOf(suerte));
/* 1610 */     float suer = suerte * 0.5F;
/* 1611 */     this.atkagua.setText(String.valueOf(suer));
/* 1612 */     this.defagua.setText(String.valueOf(suer));
/*      */     
/* 1614 */     if (suerte < 250) {
/* 1615 */       this.masinte.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void massuerActionPerformed(ActionEvent evt) {
/* 1620 */     int suerte = Integer.parseInt(this.contsuer.getText());
/*      */     
/* 1622 */     suerte++;
/* 1623 */     if (!this.menossuer.isEnabled()) {
/* 1624 */       this.menossuer.setEnabled(true);
/*      */     }
/* 1626 */     this.contsuer.setText(String.valueOf(suerte));
/* 1627 */     Actualizar(3, -3);
/* 1628 */     float suer = suerte * 0.5F;
/* 1629 */     this.atkagua.setText(String.valueOf(suer));
/* 1630 */     this.defagua.setText(String.valueOf(suer));
/*      */     
/* 1632 */     if (suerte == 250)
/* 1633 */       this.masinte.setEnabled(false);
/*      */   }
/*      */   
/*      */   private JLabel jLabel12;
/*      */   private JLabel jLabel13;
/*      */   private JLabel jLabel14;
/*      */   private JLabel jLabel15;
/*      */   private JLabel jLabel16;
/*      */   private void continteActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void contpercActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void masvolActionPerformed(ActionEvent evt) {
/* 1646 */     int vol = Integer.parseInt(this.contvol.getText());
/* 1647 */     vol++;
/* 1648 */     int atpa = Integer.parseInt(this.quitapa.getText());int respa = Integer.parseInt(this.defpa.getText());
/*      */     
/* 1650 */     if (!this.menosvol.isEnabled()) {
/* 1651 */       this.menosvol.setEnabled(true);
/*      */     }
/* 1653 */     this.contvol.setText(String.valueOf(vol));
/* 1654 */     Actualizar(10, -10);
/* 1655 */     if (vol % 2 == 0)
/*      */     {
/* 1657 */       respa++;
/*      */     }
/* 1659 */     atpa++;
/*      */     
/* 1661 */     this.quitapa.setText(String.valueOf(atpa));
/* 1662 */     this.defpa.setText(String.valueOf(respa));
/*      */     
/* 1664 */     if (vol == 50) {
/* 1665 */       this.masvol.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menosvolActionPerformed(ActionEvent evt)
/*      */   {
/* 1671 */     int vol = Integer.parseInt(this.contvol.getText());
/* 1672 */     int atpa = Integer.parseInt(this.quitapa.getText());int respa = Integer.parseInt(this.defpa.getText());
/* 1673 */     Actualizar(-10, 10);
/* 1674 */     if (vol % 2 == 0)
/*      */     {
/* 1676 */       respa--;
/*      */     }
/* 1678 */     atpa--;
/*      */     
/* 1680 */     this.quitapa.setText(String.valueOf(atpa));
/* 1681 */     this.defpa.setText(String.valueOf(respa));
/* 1682 */     vol--;
/* 1683 */     if (vol == 0) {
/* 1684 */       this.menosvol.setEnabled(false);
/*      */     }
/*      */     
/* 1687 */     this.contvol.setText(String.valueOf(vol));
/*      */     
/* 1689 */     if (vol < 22) {
/* 1690 */       this.masvol.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void menospercActionPerformed(ActionEvent evt) {
/* 1695 */     int perc = Integer.parseInt(this.contperc.getText());
/* 1696 */     Actualizar(-1, 1);
/* 1697 */     perc--;
/* 1698 */     if (perc == 0) {
/* 1699 */       this.menosperc.setEnabled(false);
/*      */     }
/*      */     
/* 1702 */     this.contperc.setText(String.valueOf(perc));
/*      */     
/* 1704 */     if (perc < 100) {
/* 1705 */       this.masperc.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void maspercActionPerformed(ActionEvent evt) {
/* 1710 */     int perc = Integer.parseInt(this.contperc.getText());
/* 1711 */     perc++;
/* 1712 */     if (!this.menosperc.isEnabled()) {
/* 1713 */       this.menosperc.setEnabled(true);
/*      */     }
/* 1715 */     this.contperc.setText(String.valueOf(perc));
/* 1716 */     Actualizar(1, -1);
/*      */     
/* 1718 */     if (perc == 100) {
/* 1719 */       this.masperc.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void contvolActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void contantActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void menosantActionPerformed(ActionEvent evt)
/*      */   {
/* 1732 */     int ant = Integer.parseInt(this.contant.getText());
/* 1733 */     Actualizar(-9, 9);
/* 1734 */     ant--;
/* 1735 */     if (ant == 0) {
/* 1736 */       this.menosant.setEnabled(false);
/*      */     }
/*      */     
/* 1739 */     this.contant.setText(String.valueOf(ant));
/*      */     
/* 1741 */     if (ant < 25) {
/* 1742 */       this.masant.setEnabled(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private void masantActionPerformed(ActionEvent evt) {
/* 1747 */     int ant = Integer.parseInt(this.contant.getText());
/* 1748 */     ant++;
/* 1749 */     if (!this.menosant.isEnabled()) {
/* 1750 */       this.menosant.setEnabled(true);
/*      */     }
/* 1752 */     this.contant.setText(String.valueOf(ant));
/* 1753 */     Actualizar(9, -9);
/*      */     
/* 1755 */     if (ant == 25) {
/* 1756 */       this.masant.setEnabled(false);
/*      */     }
/*      */   }
/*      */   
/*      */   private void masmenosalcanceActionPerformed(ActionEvent evt)
/*      */   {
/* 1762 */     if (this.masmenosalcance.isSelected())
/*      */     {
/* 1764 */       Actualizar(80, -80);
/*      */     }
/*      */     else {
/* 1767 */       Actualizar(-80, 80);
/*      */     }
/*      */   }
/*      */   
/*      */   private JLabel jLabel2;
/*      */   private JLabel jLabel3;
/*      */   private JLabel jLabel4;
/*      */   private JLabel jLabel5;
/*      */   private JLabel jLabel6;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel8;
/*      */   private JLabel jLabel9;
/*      */   private JLabel luckicon;
/*      */   private JButton masagi;
/*      */   private JButton masant;
/*      */   private JButton mascrit;
/*      */   
/*      */   private void atkfuegoActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   public static void main(String[] args)
/*      */   {
/*      */     try {
/* 1789 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1790 */         if ("Nimbus".equals(info.getName())) {
/* 1791 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1792 */           break;
/*      */         }
/*      */       }
/*      */     } catch (ClassNotFoundException ex) {
/* 1796 */       java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 1798 */       java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 1800 */       java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1802 */       java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1809 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run() {
/* 1812 */         new Calculadora().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private JButton masesq;
/*      */   private JButton masfuerza;
/*      */   private JButton masini;
/*      */   private JButton masins;
/*      */   private JButton masinte;
/*      */   private javax.swing.JCheckBox masmenosalcance;
/*      */   private JButton maspa;
/*      */   private JButton maspdv;
/*      */   private JButton masperc;
/*      */   private JButton masplac;
/*      */   private JButton maspm;
/*      */   private JButton massuer;
/*      */   private JButton masvol;
/*      */   private JButton menosagi;
/*      */   private JButton menosant;
/*      */   private JButton menoscrit;
/*      */   private JButton menosesq;
/*      */   private JButton menosfuerza;
/*      */   private JButton menosini;
/*      */   private JButton menosins;
/*      */   private JButton menosinte;
/*      */   private JButton menospa;
/*      */   private JButton menospdv;
/*      */   private JButton menosperc;
/*      */   private JButton menosplac;
/*      */   private JButton menospm;
/*      */   private JButton menossuer;
/*      */   private JButton menosvol;
/*      */   private JLabel pas;
/*      */   private JLabel percepicon;
/*      */   private JLabel pms;
/*      */   private JLabel pms4;
/*      */   private JLabel puntosdevida;
/*      */   private JTextField puntosusados;
/*      */   private JTextField quitapa;
/*      */   private JTextField quitapm;
/*      */   private JLabel voluntadicon;
/*      */ }


/* Location:              /home/alex/Descargas/CalcuWakfu/Wakfu.jar!/Calculadora.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */