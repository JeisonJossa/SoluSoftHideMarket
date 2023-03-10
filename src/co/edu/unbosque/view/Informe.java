package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class Informe extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInformeUsuario panel_informe_usuarios = new PanelInformeUsuario(
			"/co/edu/unbosque/imagenes/reporte.png");
	private InformeUsuariosParejas informe_usuario_pareja = new InformeUsuariosParejas(
			"/co/edu/unbosque/imagenes/reporte.png");

	/**
	 * Este es el metodo constructor el cual se le asigna la inicialización de
	 * los atributos, objetos y forma de organización del JFrame. De esta manera
	 * el objecto es creado con un valor inicial. Este método se llama
	 * automaticamente cuando se crea el objeto.<b>post</b> Se genera la ventana
	 * con el panel seleccionado .<br>
	 * 
	 */
	public Informe() {

		setLayout(null);
		setSize(900, 700);
		setLocationRelativeTo(null);
		setResizable(true);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(false);
		setVisible(false);
		add(panel_informe_usuarios);
		add(informe_usuario_pareja);
	}

	/**
	 * Este metodo devuelve el valor del PanelInformeUsuario. <b>post</b>Se fija
	 * un nuevo valor al atributo.<br>
	 * 
	 * @return Retorna el atributo en formato de PanelInformeUsuario.
	 */
	public PanelInformeUsuario getPanel_informe() {
		return panel_informe_usuarios;
	}

	/**
	 * Este metodo establece el valor del PanelInformeUsuario. <b>post</b>Se
	 * fija un nuevo valor al atributo.<br>
	 * 
	 * @param panel_informe_usuarios
	 *            Este parametro representa el nuevo valor del panel.
	 */
	public void setPanel_informe(PanelInformeUsuario panel_informe_usuarios) {
		this.panel_informe_usuarios = panel_informe_usuarios;
	}

	/**
	 * Este metodo devuelve el valor del PanelInformeUsuario. <b>post</b>Se fija
	 * un nuevo valor al atributo.<br>
	 * 
	 * @return Retorna el atributo en formato de PanelInformeUsuario.
	 * 
	 */
	public PanelInformeUsuario getPanel_informe_usuarios() {
		return panel_informe_usuarios;
	}

	/**
	 * Este metodo establece el valor del PanelInformeUsuario. <b>post</b>Se
	 * fija un nuevo valor al atributo.<br>
	 * 
	 * @param panel_informe_usuarios
	 *            Este parametro representa el nuevo valor del panel.
	 */
	public void setPanel_informe_usuarios(
			PanelInformeUsuario panel_informe_usuarios) {
		this.panel_informe_usuarios = panel_informe_usuarios;
	}

	/**
	 * Este metodo devuelve el valor del InformeUsuariosParejas. <b>post</b>Se
	 * fija un nuevo valor al atributo.<br>
	 * 
	 * @return Retorna el atributo en formato de InformeUsuariosParejas.
	 */
	public InformeUsuariosParejas getInforme_usuario_pareja() {
		return informe_usuario_pareja;
	}

	/**
	 * Este metodo establece el valor del InformeUsuariosParejas. <b>post</b>Se
	 * fija un nuevo valor al atributo.<br>
	 * 
	 * @param informe_usuario_pareja
	 *            Este parametro representa el nuevo valor del panel.
	 */
	public void setInforme_usuario_pareja(
			InformeUsuariosParejas informe_usuario_pareja) {
		this.informe_usuario_pareja = informe_usuario_pareja;
	}

}
