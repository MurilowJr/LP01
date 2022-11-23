package novo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FormAviao extends JFrame {

	private JPanel contentPane;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JTextField txtMotor;
	private JTextField txtMaterial;
	private JTextField txtVelocidade;
	HashSet<String> id;
	ArrayList<Aviao> list;
	HashMap<String, Aviao> map;
	Aviao a1;
	private JTextField txtChassis;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAviao frame = new FormAviao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormAviao() {
		map = new HashMap<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new ArrayList<>();
		id = new HashSet<String>();
		
		JLabel lblAviao = new JLabel("AVI\u00C3O");
		lblAviao.setFont(new Font("Arial", Font.BOLD, 27));
		lblAviao.setBounds(170, 11, 96, 49);
		contentPane.add(lblAviao);
		
		JLabel chassis = new JLabel("Chassi");
		chassis.setHorizontalAlignment(SwingConstants.RIGHT);
		chassis.setFont(new Font("Arial", Font.PLAIN, 16));
		chassis.setBounds(10, 82, 96, 28);
		contentPane.add(chassis);
		
		JLabel cor = new JLabel("Cor");
		cor.setHorizontalAlignment(SwingConstants.RIGHT);
		cor.setFont(new Font("Arial", Font.PLAIN, 16));
		cor.setBounds(10, 158, 96, 28);
		contentPane.add(cor);
		
		JLabel modelo = new JLabel("Modelo");
		modelo.setHorizontalAlignment(SwingConstants.RIGHT);
		modelo.setFont(new Font("Arial", Font.PLAIN, 16));
		modelo.setBounds(10, 119, 96, 28);
		contentPane.add(modelo);
		
		JLabel motor = new JLabel("Motor");
		motor.setHorizontalAlignment(SwingConstants.RIGHT);
		motor.setFont(new Font("Arial", Font.PLAIN, 16));
		motor.setBounds(35, 197, 71, 28);
		contentPane.add(motor);
		
		JLabel material = new JLabel("Material");
		material.setHorizontalAlignment(SwingConstants.RIGHT);
		material.setFont(new Font("Arial", Font.PLAIN, 16));
		material.setBounds(28, 236, 78, 28);
		contentPane.add(material);
		
		JLabel velocidade = new JLabel("Velocidade");
		velocidade.setHorizontalAlignment(SwingConstants.RIGHT);
		velocidade.setFont(new Font("Arial", Font.PLAIN, 16));
		velocidade.setBounds(10, 275, 96, 28);
		contentPane.add(velocidade);
		
		txtChassis = new JTextField();
		txtChassis.setColumns(10);
		txtChassis.setBounds(115, 82, 276, 26);
		contentPane.add(txtChassis);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(115, 119, 276, 26);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(115, 161, 276, 26);
		contentPane.add(txtCor);
		
		txtMotor = new JTextField();
		txtMotor.setColumns(10);
		txtMotor.setBounds(115, 200, 276, 26);
		contentPane.add(txtMotor);
		
		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(115, 239, 276, 26);
		contentPane.add(txtMaterial);
		
		txtVelocidade = new JTextField();
		txtVelocidade.setColumns(10);
		txtVelocidade.setBounds(115, 278, 276, 26);
		contentPane.add(txtVelocidade);
		
		JButton confirmBtn = new JButton("Confirmar");
		confirmBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				a1 = new Aviao();
				a1.setChassis(txtChassis.getText());
				txtChassis.setText("");
				a1.setModelo(txtModelo.getText());
				txtModelo.setText("");
				a1.setCor(txtCor.getText());
				txtCor.setText("");
				a1.setMotor(txtMotor.getText());
				txtMotor.setText("");
				a1.setMaterial(txtMaterial.getText());
				txtMaterial.setText("");
				a1.setVelocidade(txtVelocidade.getText());
				txtVelocidade.setText("");
				list.add(a1);
				id.add(a1.getChassis());
				JOptionPane.showMessageDialog(null , a1.salvar());
				map.put(a1.getChassis(), a1);
				
				for (String key: map.keySet()) {
					
					System.out.println(key + map.get(key).getCor() 
							+ map.get(key).getMaterial()
							+ map.get(key).getModelo()
							+ map.get(key).getMotor()
							+ map.get(key).getVelocidade());
					JOptionPane.showMessageDialog(null,"Chassi" + key + "cadastrado");
				}
			}
		});
		
		
		confirmBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		confirmBtn.setBounds(77, 332, 129, 56);
		contentPane.add(confirmBtn);
	}
}
	