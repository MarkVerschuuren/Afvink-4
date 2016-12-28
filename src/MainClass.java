/**
 * Created by Mark Verschuuren on 28-12-2016.
 */
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class MainClass  extends JFrame {
    private JTree tree;
    public MainClass(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Derde jaar");
        DefaultMutableTreeNode stageNode = new DefaultMutableTreeNode("Stage");
        DefaultMutableTreeNode minorNode = new DefaultMutableTreeNode("Minor");

        minorNode.add(new DefaultMutableTreeNode("HAN"));
        minorNode.add(new DefaultMutableTreeNode("Andere hogeschool"));
        minorNode.add(new DefaultMutableTreeNode("Universiteit Premaster"));

        DefaultMutableTreeNode NederlandNode = new DefaultMutableTreeNode("Nederand");
        NederlandNode.add(new DefaultMutableTreeNode("Utrecht"));
        DefaultMutableTreeNode NijmegenNode = new DefaultMutableTreeNode("Nijmegen");
        DefaultMutableTreeNode WageningenNode = new DefaultMutableTreeNode("Wageningen");

        NederlandNode.add(WageningenNode);
        NederlandNode.add(NijmegenNode);

        WageningenNode.add(new DefaultMutableTreeNode("WUR"));
        WageningenNode.add(new DefaultMutableTreeNode("KeyGene"));
        WageningenNode.add(new DefaultMutableTreeNode("GeneTwister"));

        NederlandNode.add(new DefaultMutableTreeNode(NijmegenNode));
        NijmegenNode.add(new DefaultMutableTreeNode("Radboud UMC"));
        NijmegenNode.add(new DefaultMutableTreeNode("Radboud Universiteit"));

        DefaultMutableTreeNode buitelandNode = new DefaultMutableTreeNode("Buitenland");

        buitelandNode.add(new DefaultMutableTreeNode("Europa"));


        root.add(stageNode);
        root.add(minorNode);
        stageNode.add(NederlandNode);
        stageNode.add(buitelandNode);

        tree = new JTree(root);
        add(tree);

        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");

        this.setLocationRelativeTo(null);


        this.setVisible(true);

    }



    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainClass();
            }
        });
    }
}
