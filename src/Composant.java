public interface Composant {

    getName(): String;
    getOwner(): Owner;
    getSize() : int;
    getContent():String;
    appendContent(in content : String): void;
    setOwner(in owner : Owner);

}
