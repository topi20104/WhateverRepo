package app;

public class CompareAnswers {
	float toll = 0;
	for (int questionID = 0; questionID < Questions.length; questionID++) {
		int a = abs(userAnswer - candidateAnswer);
		if (a == 0) {
			toll += 1;
		}
		else if (a == 1) {
			toll += 0.75;
		}
		else if (a == 2) {
			toll += 0.5;
		}
		else if (a == 3) {
			toll += 0.25;
		}
	return (toll / Questions.length);
	}
	
}
