package chap01;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class C4FileNameDemo {
	public static void main(String[] args) {
		File directory = new File("./src/main/java/chap01");
		String[] names = directory.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		System.out.println(Arrays.asList(names));
		
		String[] names2 = directory.list((dir, name) -> name.endsWith(".java"));
		System.out.println(Arrays.asList(names2));
	}
}
