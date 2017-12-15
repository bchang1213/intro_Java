class ProjectTest{
	public static void main(String[] args) {
		Project p1 = new Project();
		Project p2 = new Project("Project1","description1");
		Project p3 = new Project ("Project1");
		
		System.out.println(p1.elevatorPitch());
		System.out.println(p2.elevatorPitch());
		System.out.println(p3.elevatorPitch());
		
		
	}
}