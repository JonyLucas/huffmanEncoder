import controller.HuffmanEncoder;
import controller.HuffmanCounter;
import infra.HuffmanWriter;

import javax.swing.*;

public class Main
{
    public static void main (String args[])
    {
        String fileInputPath = "src\\examples\\Exemplo_18K.txt";//JOptionPane.showInputDialog("File Input Path:");
        String fileOutputPath = "src\\examples\\resultEncoder.txt";

        HuffmanCounter huffmanCounter = new HuffmanCounter(fileInputPath);
        huffmanCounter.readAndCount();

        HuffmanEncoder huffmanEncoder = new HuffmanEncoder(fileInputPath, huffmanCounter.getFrenquency());
        huffmanEncoder.readAndDecrement();

        new HuffmanWriter().saveFile(fileOutputPath, huffmanCounter.getFrenquency(), huffmanEncoder.getCode());
    }

}
