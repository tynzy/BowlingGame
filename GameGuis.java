public class GameGuiS extends JFrame implements ActionListener{

    DefaultTableModel model;
    JTable table;
    JPanel panel = new JPanel();
    JPanel pan = new JPanel();
    JButton roll = new JButton("ROLL");
    JButton start = new JButton("Start");
    JButton topButtons[] = new JButton[]{
        new JButton("1"),
        new JButton("2"),
        new JButton("3"),
        new JButton("4"),
        new JButton("5"),
        new JButton("6"),
        new JButton("7"),
        new JButton("8"),
        new JButton("9"),
        new JButton ("Strike")
        
       };
     List<Players> players = new ArrayList();
    
    public GameGuiS(){
        super("Bowling GAME");
        setSize(900,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUPScoreTable();
        Container container = getContentPane();
        container.add(new JScrollPane(table), BorderLayout.NORTH);
        GridLayout grid = new GridLayout(1, 3);
        FlowLayout flow = new FlowLayout();
        start.addActionListener(this);
        roll.addActionListener(this);
        
        pan.setLayout(flow);
        for(JButton btn: topButtons ){
            pan.add(btn);
            btn.setVisible(false);
            btn.addActionListener(this);
        }
        roll.setEnabled(false);
        panel.setLayout(grid);
        panel.add(start);
        panel.add(roll);
        add(CENTER,pan);
        add(SOUTH,panel);
        setVisible(true);
    }
    
   private void setUPScoreTable(){
     
    int frme[] = new int [10];// number of frames in a game
    int allfrmes [] [] = new int [2] [12];// 2 goes in each frame, 2 extra 
                                          //frames for spare or strike in frame 10.
     
   model = new DefaultTableModel();
   model.addColumn("Name");
   model.addColumn("1");
   model.addColumn("2");
   model.addColumn("3");
   model.addColumn("4");
   model.addColumn("5");
   model.addColumn("6");
   model.addColumn("7");
   model.addColumn("8");
   model.addColumn("9");
   model.addColumn("10");
   model.addColumn("Total");
   table = new JTable(model);
 
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
           
            int numbOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Players"));
            for (int i = 0; i < numbOfPlayers; i++) {
                String name = JOptionPane.showInputDialog(null, "Enter names of Player " + (i + 1));
                players.add(new Players(name, 0));
                model.addRow(new Object [] {name});
            }
            roll.setEnabled(true);
        }
        if (e.getSource() == roll) {
            gamePlay();
            roll.setText("Select Score");
        }
        if (e.getSource() == topButtons[0]) {
            System.out.println("1");
            resetButtons();
        }
         if (e.getSource() == topButtons[1]) {
            System.out.println("2");
            resetButtons();
        }
          if (e.getSource() == topButtons[2]) {
            System.out.println("3");
            resetButtons();
        }
         if (e.getSource() == topButtons[3]) {
            System.out.println("4");
            resetButtons();
        }
          if (e.getSource() == topButtons[4]) {
            System.out.println("5");
            resetButtons();
        }
         if (e.getSource() == topButtons[5]) {
            System.out.println("6");
            resetButtons();
        } 
         if (e.getSource() == topButtons[6]) {
            System.out.println("7");
            resetButtons();
        }
          if (e.getSource() == topButtons[7]) {
            System.out.println("8");
            resetButtons();
        }
         if (e.getSource() == topButtons[8]) {
            System.out.println("9");
            resetButtons();
        }
         if (e.getSource() == topButtons[9]) {
            System.out.println("10");
            resetButtons();
        } 
    }
    
    
    private void gamePlay(){
        for (Players p : players) {
            for(JButton btn: topButtons ){
               btn.setVisible(true);
         }
        }
    
    }
    
    private void resetButtons(){
     for(JButton btn: topButtons ){
             btn.setVisible(false);
          }
     roll.setText("ROLL");
    }
    
}
