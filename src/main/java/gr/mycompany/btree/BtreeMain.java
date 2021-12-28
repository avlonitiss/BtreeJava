/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gr.mycompany.btree;

/**
 *
 * @author Spyros
 */
public class BtreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO create the root node and the rest nodes without connection
        BtreeNode rootNode = new BtreeNode("root");
        rootNode.printBtreeNode();
        
        BtreeNode aNode = new BtreeNode("a");
        aNode.printBtreeNode();
        
        BtreeNode bNode = new BtreeNode("b");
        bNode.printBtreeNode();
        
        BtreeNode cNode = new BtreeNode("c");
        cNode.printBtreeNode();
        
        BtreeNode dNode = new BtreeNode("d");
        dNode.printBtreeNode();
        
        BtreeNode eNode = new BtreeNode("e");
        eNode.printBtreeNode();
        
        
        //TODO create the connections as the following example in comments
        
        /*
        [root]
         /  \
        a    b
       / \    \
      c   d    e
        
        */
        
        rootNode.setLeft(aNode);
        rootNode.setRight(bNode);
        
        System.out.println("\n*** root node has now two children ***\n");
        
        rootNode.printBtreeNode();
        
        //TODO complete the tree in the comments above
        //TODO create a method in BtreeNode class to see if the node is leaf (has no children)
        
    }
    
    
}
