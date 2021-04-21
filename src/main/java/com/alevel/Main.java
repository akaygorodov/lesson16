package com.alevel;

public class Main {

    public static void main(String[] args) {
        MyTree<String, String> tree = MyTree.builder("1.0", "A")
                                             .left(MyTree.builder("2.0", "B")
                                                         .left(MyTree.builder("3.0", "C")
                                                                     .build())
                                                         .right(MyTree.builder("4.0", "D")
                                                                      .build())
                                                         .build())
                                             .right(MyTree.builder("5.0", "E")
                                                          .right(MyTree.builder("6.0", "F")
                                                                       .build())
                                                          .build())
                                             .build();

        TreeIterator iterator = new TreeIterator();
        System.out.println(iterator.searchInWidth(tree, "5.0"));
        System.out.println(iterator.searchInDeep(tree, "5.0"));
    }
}
