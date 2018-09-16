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
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        tambahPasienMenuItem = new JMenuItem("TambahPasien");
        fileMenu.add(tambahPasienMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        tambahPasienMenuItem.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasienMenuItem) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.setSize(300, 400);
            test.setVisible(true);
        }
        
        if (e.getSource() == tambahPasienMenuItem) {
            TambahAntrianDialog test = new TambahAntrianDialog();
            test.setSize(300, 400);
            test.setVisible(true);
        }
    }

}
