/*
 * File:    StateInformation.java
 * Author:  Anthony Smith
 * Date:    6 October 2018
 * Purpose: Creates state bird class that stores all state names birds, and flowers
 */
public class StateInformation {
    //create 2 dimensional array with all stat names, birds and flowers
    String[][]stateBirdsAndFlowers = new String[][]{
            {"Alabama", "Yellowhammer", "Camellia"},
            {"Alaska", "Willow Ptarmigan", "Forget-Me-Not"},
            {"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
            {"Arkansas", "Mockingbird", "Apple Blossom"},
            {"California", "California Valley Quail", "Golden Poppy"},
            {"Colorado", "Lark Bunting", "Rocky Mountain Columbine"},
            {"Connecticut", "Robin", "Mountain Laurel"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
            {"Florida", "Mockingbird", "Orange Blossom"},
            {"Georgia", "Brown Thrasher", "Cherokee Rose"},
            {"Hawaii", "Nene", "Hawaiian Hibiscus"},
            {"Idaho", "Mountain Bluebird", "Lewis' mock-orange"},
            {"Illinois", "Cardinal", "Violet"},
            {"Indiana", "Cardinal", "Peony"},
            {"Iowa", "Eastern Goldfinch", "Wild Prairie Rose"},
            {"Kansas", "Western Meadowlark", "Sunflower"},
            {"Kentucky", "Cardinal", "Goldenrod"},
            {"Louisiana", "Eastern Brown Pelican", "Magnolia"},
            {"Maine", "Chickadee", "Pine Cone and Tassel"},
            {"Maryland", "Baltimore Oriole", "Black-Eyed Susan"},
            {"Massachusetts", "Chickadee", "Mayflower"},
            {"Michigan", "Robin", "Apple Blossom"},
            {"Minnesota", "Common Loon", "Pink and White Lady's Slippper"},
            {"Mississippi", "Mockingbird", "Magnolia"},
            {"Missouri", "Bluebird", "Hawthorn"},
            {"Montana", "Western Meadowlark", "Bitterroot"},
            {"Nebraska", "Western Meadowlark", "Goldenrod"},
            {"Nevada", "Mountain Bluebird", "Sagebrush"},
            {"New Hampshire", "Purple Finch", "Purple Lilac"},
            {"New Jersey", "Eastern Goldfinch", "Violet"},
            {"New Mexico", "Roadrunner", "Yucca Flower"},
            {"New York", "Bluebird", "Rose"},
            {"North Carolina", "Cardinal", "Flowering Dogwood"},
            {"North Dakota", "Western Meadowlark", "Wild Prairie Rose"},
            {"Ohio", "Cardinal", "Scarlet Carnation"},
            {"Oklahoma", "Scissor-tailed Flycatcher", "Oklahoma Rose"},
            {"Oregon", "Western Meadowlark", "Oregon Grape"},
            {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
            {"Rhode Island", "Rhode Island Red", "Violet"},
            {"South Carolina", "Great Carolina Wren", "Yellow Jessamine"},
            {"South Dakota", "Ring-necked Pheasant", "Pasque Flower"},
            {"Tennessee", "Mockingbird", "Purple Passionflower"},
            {"Texas", "Mockingbird", "Bluebonnet"},
            {"Utah", "Common American Gull", "Sego Lily"},
            {"Vermont", "Hermit Thrush", "Red Clover"},
            {"Virginia", "Cardinal", " American Dogwood"},
            {"Washington", "Willow Goldfinch", "Coast Rhododendron"},
            {"Washington D.C", "Wood thrush", "American Beauty Rose"},
            {"West Virginia", "Cardinal", "Rhododendron"},
            {"Wisconsin", "Robin", "Wood Violet"},
            {"Wyoming", "Western Meadowlark", "Indian Paintbrush"}
        };

    //getter to access array from outside of class
    public String[][] getStateBirdsAndFlowers() {
        return stateBirdsAndFlowers;
    }
}
