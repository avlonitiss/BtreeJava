/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.mycompany.btree;

/**
 *
 * @author sp
 */
public class BtreeNode {
    
        private String nodeValue;
        private BtreeNode left;
        private BtreeNode right;

    public BtreeNode(String nodeValue) {
        this.nodeValue = nodeValue;
        this.left = null;
        this.right = null;
    }

    public BtreeNode getLeft() {
        return left;
    }

    public BtreeNode getRight() {
        return right;
    }

    public void setLeft(BtreeNode left) {
        this.left = left;
    }

    public void setRight(BtreeNode right) {
        this.right = right;
    }
        
    public void printBtreeNode() {
        System.out.println("Node value is: " + this.nodeValue +"\n"+
                "Left child value is: "+this.getLeft().nodeValue+"\n"+
                "Right child value is: "+this.getRight().nodeValue+"\n");
    }

    /**
     * Get the value of nodeValue
     *
     * @return the value of nodeValue
     */
    public String getNodeValue() {
        return nodeValue;
    }

    /**
     * Set the value of nodeValue
     *
     * @param nodeValue new value of nodeValue
     */
    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    
}
