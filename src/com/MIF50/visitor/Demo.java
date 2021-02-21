package com.MIF50.visitor;

public class Demo {
    public static void main(String[] args) {
      var document = new HtmlDocument();
      document.add(new HeadingNode());
      document.add(new AnchorNode());
      document.execute(new HighlightOperation());
      document.execute(new PlainTextOperation());
    }
}
