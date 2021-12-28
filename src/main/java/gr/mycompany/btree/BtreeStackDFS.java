/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.mycompany.btree;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Spyros
 */
public class BtreeStackDFS {
    
    private List<BtreeNode> stack = new ArrayList<>();
      
     //List is used as a stack for DFS traversal of bTree
    public void push(BtreeNode node){
        stack.add(node);
    }
    
    public BtreeNode pop(){
        if (stack.isEmpty()){
            return null;
    }
        BtreeNode top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
}
    public int size(){
        return stack.size();
    }
}