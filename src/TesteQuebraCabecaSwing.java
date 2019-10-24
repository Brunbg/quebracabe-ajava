/**
 * IFPB - TSI/POO
 * Prof. Fausto Ayres
 * 
 * Aplicação swing do Quebra-Cabeca
 * 
 */


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TesteQuebraCabecaSwing {

	private JFrame frame;
	private JButton button;
	private QuebraCabeca jogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteQuebraCabecaSwing window = new TesteQuebraCabecaSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TesteQuebraCabecaSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.frame = new JFrame();
		this.frame.setTitle("Quebra Cabeca");
		this.frame.setBounds(100, 100, 455, 328);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);
		
		//criar o quebra-cabeca
		String[] nomes = {"/imagens3x3/1.jpg","/imagens3x3/2.jpg","/imagens3x3/3.jpg","/imagens3x3/4.jpg","/imagens3x3/5.jpg",
		"/imagens3x3/6.jpg","/imagens3x3/7.jpg","/imagens3x3/8.jpg","/imagens3x3/9.jpg"};
		this.jogo = new QuebraCabeca (3,nomes);
		this.jogo.setSize(370, 195);
		this.jogo.setLocation(33, 55);
		this.frame.getContentPane().add(this.jogo);
		
	
		this.button = new JButton("Iniciar");
		this.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TesteQuebraCabecaSwing.this.jogo.iniciar();
			}
		});
		this.button.setBounds(161, 21, 100, 23);
		this.frame.getContentPane().add(this.button);
	}
}