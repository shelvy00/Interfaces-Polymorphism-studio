package org.launchcode.studio7;

public class CD extends BaseDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final String genre;

    private final String productionCo;

    public CD(String title, String author, String discType, String genre, String productionCo) {
        super(title, author, discType);
        this.genre = genre;
        this.productionCo = productionCo;
    }


    @Override
    public String toString() {
        StringBuilder filelist = new StringBuilder();
        for (File file : getFiles()) {
            filelist.append(file);
        }
        return super.toString() +
                "/nGenre: " + genre +
                "/n Production Company: " + productionCo +
                "\n Tracks:\n" +
                filelist;
    }

    @Override
    public void readData() {
        System.out.println(this);
    }

    @Override
    public void runFile(File file) {
        System.out.println("you are now enjoying " + file.getName() + "by " + getAuthor());
    }

    @Override
    public void writeData(File file) {
        if ((!file.getFileType().equals("audio"))) {
            System.out.println("That " + file.getFileType() + "file type cannot be written to a CD");
        }
        if (getSpaceUsed() + file.getSize() > CAPACITIES.get(getDiscType())) {
            System.out.println("there is not enough space on the " + getDiscType() + " for " + file.getName());
        }else {
            getFiles().add(file);
        }
    }
}
