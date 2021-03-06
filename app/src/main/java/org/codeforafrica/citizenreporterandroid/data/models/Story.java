package org.codeforafrica.citizenreporterandroid.data.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Ahereza on 7/30/17.
 */

public class Story {
    private int local_id;
    private int assignmentId;
    private String title;
    private String cause;
    private String who;
    private String author;
    private String authorId;
    private String when;
    private List<String> media = new ArrayList<>();
    private boolean uploaded;
    private String updated;
    private String where;

    public Story() {
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String putMediaIntoDB() {
        /**
         * method returns a string consisting of all the paths the media attached separated by comas
         * This is useful when saving the media to the database
         */
        if(media.size() > 0){
            String concat_media = "";
            for(String item: media){
                concat_media = concat_media + item + ",";
            }
            return concat_media;
        } else {
            return "";
        }
    }

    public List<String> getMedia() {
        return media;
    }

    public void addMedia(String media) {
        /**
         * adds a media item to the media list of the object
         */
        this.media.add(media);
    }

    public void setMediaFromDB(String media_csv) {
        /**
         * read a comma separated string from the database and convert it to a list
         * First remove the trailing comma if it's there
         */
        if(media_csv.length() > 0){
            char last_char = media_csv.charAt(media_csv.length() - 1);
            if (last_char == ','){
                media_csv = media_csv.substring(0, media_csv.length() - 1);
            }
            List<String> temp_items = Arrays.asList(media_csv.split("\\s*,\\s*"));
            // lists generated by asList don't allow any structual modification
            List<String> items = new ArrayList<>();

            for (String path: temp_items) {
                items.add(path);
            }
            this.media = items;
        } else {
            this.media = Collections.EMPTY_LIST;
        }

    }


    public boolean isUploaded() {
        return uploaded;
    }

    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
