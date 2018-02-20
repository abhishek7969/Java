package TopCoder;

public class SRM587_InsertZ {

	public static void main(String[] args) {
		System.out.println(canTransform("fox", "zfzoxzz"));
	}

	public static String canTransform(String init, String goal) {

		if (init.equalsIgnoreCase(goal))
			return "Yes";

		if (goal.contains("z")) {
			goal = init.replaceAll("z", "");
		}

		if (init.equalsIgnoreCase(goal))
			return "Yes";
		else
			return "No";

	}

}
