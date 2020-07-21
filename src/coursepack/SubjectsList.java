/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursepack;

import stackexample.LinkedStack;

/**
 *
 * @author Enubs
 */
public class SubjectsList{
    
    private final LinkedStack<Subjects> subjectsList;
    
    public SubjectsList(){
        subjectsList = new LinkedStack<>();
    }
    
    public void addSubject(Subjects subject){
        subjectsList.push(subject);
    }
    
    public Subjects finishedSubject(){
        return subjectsList.pop();
    }
    
   
}
