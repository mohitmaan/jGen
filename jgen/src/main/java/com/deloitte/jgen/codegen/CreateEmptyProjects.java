package com.deloitte.jgen.codegen;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateEmptyProjects {

	public static void main(String[] args) {

		String uiProjectName = "pocUi";
		String mavenProjectName = "pocBackend";
		String mavenProjectPackageName = "com.deloitte.poc";
		String targetFolder = "C:\\Users\\mmaan\\Desktop\\test";
		StringBuilder commands = new StringBuilder("");

		File file = new File(targetFolder);
		if (file.exists()) {
			file.delete();
		}
		file.mkdir();

		commands.append("dir && cd " + targetFolder).append(" && dir")
				.append(" && mvn archetype:generate -DgroupId=" + mavenProjectPackageName + " -DartifactId="
						+ mavenProjectName
						+ " -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false")
				.append(" && dir").append(" && cd " + mavenProjectName).append(" && dir")
				.append(" && mvn eclipse:eclipse").append(" && dir").append(" && cd ..").append(" && dir")
				// command to create Angular Project assuming system already has required installations
				.append(" && ng new " + uiProjectName).append(" && dir");

		ProcessBuilder processBuilder = new ProcessBuilder();

		// Run this on Windows, cmd, /c = terminate after this run
		processBuilder.command("cmd.exe", "/c", commands.toString());

		try {

			Process process = processBuilder.start();

			// blocked :(
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			int exitCode = process.waitFor();
			System.out.println("\nExited with error code : " + exitCode);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
