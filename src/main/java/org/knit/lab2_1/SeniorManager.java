package org.knit.lab2_1;

public class SeniorManager extends Manager {
    @Override
    protected boolean canApprove(Problem problem) {
        return 11 <= problem.getDifficult() && problem.getDifficult() <= 50;
    }

    @Override
    protected void approve(Problem problem) {
        System.out.println("Старший менеджер одобрил запрос на сложность: " + problem.getDifficult() + "\n описание запроса: " + problem.getDescription());
    }
}