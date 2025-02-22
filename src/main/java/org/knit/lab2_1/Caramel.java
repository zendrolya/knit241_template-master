package org.knit.lab2_1;

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n\uD83C\uDF61Добавлена карамель";
    }
}