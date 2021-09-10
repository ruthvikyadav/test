class BLACK
{
    public static Door trimDoor(DoorType model)
    {
        Door door = null;
        switch (model)
        {
            case GLASS:
                door = new GlassDoor(Color.BLACK);
                break;
              
            case FLUSH:
                door = new FlushDoor(Color.BLACK);
                break;
                  
            case WOOD:
                door = new WoodDoor(Color.BLACK);
                break;
                  
                default:
                break;
              
        }
        return door;
    }
}