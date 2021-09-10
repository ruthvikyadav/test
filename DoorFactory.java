class DoorFactory
{
    private DoorFactory() 
    {
          
    }
    public static Door trimDoor(DoorType type)
    {
        Door door = null;
      
        Color color = Color.WHITE; 
      
          
        switch(color)
        {
            case BLACK:
                door = BLACK.trimDoor(type);
                break;
                  
            case WHITE:
                door = WHITE.trimDoor(type);
                break;
                      
            default:
            	door = Brown.trimDoor(type);
            
  
        }
        
          
        return door;
  
    }
}