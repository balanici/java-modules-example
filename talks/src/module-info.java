module talks {
    exports zoo.animal.talks.content to staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    requires transitive care;
}