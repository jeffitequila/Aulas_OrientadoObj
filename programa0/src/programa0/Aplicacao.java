package programa0;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Aplicacao extends JFrame implements ActionListener{
    
    
    JLabel jlNome, jend, jBairro;
    JTextField tfNome, tfend, tfBairro;
    JComboBox cdEst, cdCid;
    JButton bGravar, bLimpar, bSair;
    
    public Aplicacao() {
        setLayout(new FlowLayout());
        jlNome = new JLabel("Nome");
        tfNome = new JTextField(20);
        add(jlNome);add(tfNome);
        jend = new JLabel("Endereço");
        tfend = new JTextField(10);
        add(jend);
        add(tfend);
        jBairro = new JLabel("Bairro");
        tfBairro = new JTextField(10);
        add(jBairro);
        add(tfBairro);
        
        String estado [] = {" ","MA","PI", "CE"};
        cdEst = new JComboBox(estado);
        add(cdEst);
        String cidade [] = {" ", "Imperoza", "Mucuíba", "Wakanda", "Gotan"};
        cdCid =  new JComboBox(cidade);
        add(cdCid);
        
        bGravar = new JButton("Gravar");
        add(bGravar);
        bLimpar = new JButton("Limpar");
        bLimpar.addActionListener(this);
        add(bLimpar);
        bSair = new JButton("Sair");
        add(bSair);
 
        setSize(640, 360);
        setTitle("Aplicação");
        setVisible(true);
    }
        
        
           
           
           
       
    
    public static void main(String[] args) {
        Aplicacao a = new Aplicacao();
        
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        tfNome.setText("");
        tfBairro.setText("");
        tfend.setText("");
        cdCid.setSelectedIndex(0);
        cdEst.setSelectedIndex(0);
    }

    
}
