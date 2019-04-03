import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class AddComponentOnJFrameAtRuntime extends JFrame implements ActionListener {

    private JPanel panel;
    private JPanel addPanel;
    private String[] petStrings = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
    private String[] choice = {"Procedures", "Inventory", "Lens to transplant"};
    private JComboBox choiceCombo = new JComboBox<>(choice);
    private JButton button = new JButton("Add");


    public AddComponentOnJFrameAtRuntime() {
        super("Add component on JFrame at runtime");
        setLayout(new BorderLayout());
        this.panel = new JPanel();
        this.addPanel = new JPanel();
        this.panel.setLayout(new FlowLayout());
        this.addPanel.setLayout(new FlowLayout());
        add(panel, BorderLayout.CENTER);
        addPanel.add(choiceCombo, BorderLayout.SOUTH);
        addPanel.add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(addPanel, BorderLayout.SOUTH);
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {

        this.choiceCombo.getSelectedItem();
        this.panel.add(new JComboBox<>(petStrings));
        this.panel.revalidate();
        validate();
    }
}