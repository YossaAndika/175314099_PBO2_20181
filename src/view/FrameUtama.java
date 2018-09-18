/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Puspaningtyas
 */
public class FrameUtama extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;

    /**
     * digunalan untuk membuat object
     * @throws HeadlessException 
     */
    public FrameUtama() throws HeadlessException {
        init();
    }

    /**
     * digunakan untuk membuat menu tampilan
     */
    public void init() {
        menuBar = new JMenuBar();//membuat object menuBar dg tipe JMenuBar
        this.setTitle("Main Frame");//membuat judul tampilan
        fileMenu = new JMenu("File");//membuat menu file dengan menggunakan JMenu
        exitMenuItem = new JMenuItem("exit");//membuat menu keluar menggunakan JMenuItem
        tambahPasienMenuItem = new JMenuItem("Tambah Pasien");//membuat menu tambah pasien menggunakan JMenuItem
        tambahAntrianMenuItem = new JMenuItem("Tambah Antrian");//membuat menu tambah pasien menggunakan JMenuItem
        fileMenu.add(tambahPasienMenuItem);//file Menu menambahkan object tambahPasienMenuItem
        fileMenu.add(tambahAntrianMenuItem);//file Menu menambahkan object tambahAntrianMenuItem
        fileMenu.add(exitMenuItem);//file Menu menambahkan object exitMenuItem
        menuBar.add(fileMenu);//menuBar menambahkan object fileMenu

        exitMenuItem.addActionListener(this);//memanggil addActionListener
        tambahPasienMenuItem.addActionListener(this);//memanggil addActionListener
        tambahAntrianMenuItem.addActionListener(this);//memanggil addActionListener

        this.setJMenuBar(menuBar);//menambahkan menuBar ke FrameUtama
    }

    /***
     * digunakan untuk pengoprasian tiap tiap object
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {//membandingkan jika yg di klik adalah exitMenuItem
            System.exit(0);
        }
        if (e.getSource() == tambahPasienMenuItem) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();//membandingkan jika yg di klik adalah tambahPasienMenuItem
            test.setSize(300, 400);
            test.setVisible(true);
        }
        
        if (e.getSource() == tambahAntrianMenuItem) {
            TambahAntrianDialog test1 = new TambahAntrianDialog();//membandingkan jika yg di klik adalah tambahAntrianMenuItem
            test1.setSize(300, 400);
            test1.setVisible(true);
        }
    }

}
