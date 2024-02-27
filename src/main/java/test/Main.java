package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

public class Main {
	public static void main(String[] args) throws IOException {
		ParseResult<CompilationUnit> parseResult = null;
		FileInputStream in = new FileInputStream("D:\\phân Tán  java\\kientrucweek2\\src\\main\\java\\test\\User.java");
		try {
			JavaParser javaParser = new JavaParser();
			parseResult = javaParser.parse(in);
			Optional<CompilationUnit> optinal = parseResult.getResult();
			if(optinal.isPresent()) {
				CompilationUnit cu = optinal.get();
				getFields(cu);
				getMethod(cu);
			}
			
		}finally {
			in.close();
		}
	}

	private static void getMethod(CompilationUnit cu) {
		// TODO Auto-generated method stub
		List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
		for (MethodDeclaration method : methods) {
			System.out.println(method);
		}
		
		
	}

	private static void getFields(CompilationUnit cu) {
		// TODO Auto-generated method stub
		List<FieldDeclaration> fields = cu.findAll(FieldDeclaration.class);
		for (FieldDeclaration fieldDeclaration : fields) {
			System.out.println(fieldDeclaration);
		}
		
	}
	void x(String folderName) {
		File folder = new File(folderName);
		File[] files = folder.listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
	}

}
