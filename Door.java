abstract class Door
{
    Door(DoorType model, Color color)
    {
        this.model = model;
        this.color = color;
    }
   
    abstract void construct();
   
    DoorType model = null;
    Color color = null;
   
    DoorType getModel()
    {
        return model;
    }
   
    void setModel(DoorType model)
    {
        this.model = model;
    }
   
    Color getColor()
    {
        return color;
    }
   
    void setColor(Color color)
    {
        this.color = color;
    }
   
    @Override
    public String toString()
    {
        
    	return "DoorModel - Type  is "+model;
        

    }
    
}