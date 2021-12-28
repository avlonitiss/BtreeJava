/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.mycompany.btree;

import java.util.Objects;

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
                "Left child value is: ");
        
       // check for null child node before print
       
      if (Objects.isNull(this.left)){
          System.out.print("Empty \n");
      }else {
          System.out.print(this.getLeft().nodeValue+"\n");
      }
      
       System.out.println("Right child value is: ");
       
       if (Objects.isNull(this.right)){
           System.out.println("Empty \n");
       }else {
           System.out.println(this.getRight().nodeValue+"\n");  
       }
      
               
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
