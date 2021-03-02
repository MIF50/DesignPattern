package com.MIF50.decorator;

public class CompressCloudStream implements Stream {

    private final Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.subSequence(0, 5).toString();
    }
}
