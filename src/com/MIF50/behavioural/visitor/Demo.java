package com.MIF50.behavioural.visitor;

import com.MIF50.behavioural.visitor.operation.HighlightOperation;
import com.MIF50.behavioural.visitor.operation.PlainTextOperation;

public class Demo {
    public static void main(String[] args) {
      var document = new HtmlDocument();
      document.add(new HeadingNode());
      document.add(new AnchorNode());
      document.execute(new HighlightOperation());
      document.execute(new PlainTextOperation());
    }
}
