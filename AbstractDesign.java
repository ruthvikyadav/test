class AbstractDesign 
{
    public static void main(String[] args)
    {
        System.out.println(DoorFactory.trimDoor(DoorType.GLASS));
        System.out.println(DoorFactory.trimDoor(DoorType.FLUSH));
        System.out.println(DoorFactory.trimDoor(DoorType.WOOD));
    }
}
