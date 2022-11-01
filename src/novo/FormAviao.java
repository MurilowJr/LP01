package novo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class FormAviao extends JFrame {

	private JPanel contentPane;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JTextField txtMotor;
	private JTextField txtMaterial;
	private JTextField txtVelocidade;
	HashSet<String> id;
	ArrayList<Aviao> list;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new ArrayList<>();
		id = new HashSet<String>();
		
		JLabel lblNewLabel = new JLabel("AVIÃO");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setBounds(171, 54, 96, 49);
		contentPane.add(lblNewLabel);
		
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
				Aviao a1 = new Aviao();
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
				id.add(a1.getModelo());
				id.add(a1.getCor());
				id.add(a1.getMotor());
				id.add(a1.getMaterial());
				id.add(a1.getVelocidade());
				JOptionPane.showMessageDialog(null , a1.salvar());
			}
		});
		
		
		confirmBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		confirmBtn.setBounds(153, 325, 129, 56);
		contentPane.add(confirmBtn);
	}
}
