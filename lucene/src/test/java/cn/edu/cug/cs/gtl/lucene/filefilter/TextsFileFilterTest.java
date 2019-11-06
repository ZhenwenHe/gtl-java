package cn.edu.cug.cs.gtl.lucene.filefilter;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class TextsFileFilterTest {

    @Test
    public void accept() {
        TextsFileFilter textsFileFilter= new TextsFileFilter();
        boolean b= textsFileFilter.accept(new File("dat/raw/word.doc"));
        Assert.assertTrue(!b);
    }
}