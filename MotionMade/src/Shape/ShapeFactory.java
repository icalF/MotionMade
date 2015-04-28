/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author FiqieUlya
 */
public class ShapeFactory {
    //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("ELLIPSE")){
         return new Ellipse();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
          return new Triangle();
      } else if(shapeType.equalsIgnoreCase("LINE")){
          return new Line();  
      }
      
      return null;
   }
}
