package lab5;

public class OnlineSchool {
    private Participant[] participants = {};
    private int count = 0;

    public void addParticipant(Participant participant){

        // using a loop filling a copy array but with one extra spot to fill
        int length = participants.length;
        if (count < 5){
            Participant[] addreg = new Participant[length+1];
            for(int i=0;i<length;i++){
                addreg[i]=participants[i];
            }
            addreg[length]= participant;
            participants=addreg;
            count++;
        }
    }

    public Participant[] getParticipants(String name) {
        int length1 = participants.length;
        int newcnt = 0;

        // checking if the name entered matches the one in the array and then adds to a count to get the total amount of participants
        for (int i = 0; i < length1; i++) {
            if (participants[i] != null) {
                for (int j = 0; j < (participants[i].getRegistrations()).length; j++) {
                    if (participants[i].getRegistrations()[j] != null) {
                        if (participants[i].getRegistrations()[j].getTitle().equals(name))
                            newcnt++;
                    }
                }
            }
        }

        // similarly checking the name again but this time filling another array with the participants
        Participant[] temppart = new Participant[newcnt];
        int w = 0;
        for (int i = 0; i < length1; i++) {
            if (participants[i] != null) {
                Registration[] newpart = participants[i].getRegistrations();
                for (int j = 0; j < newpart.length; j++) {
                    if (newpart[i] != null) {
                        if (newpart[j].getTitle().equals(name)) {
                            temppart[w] = participants[i];
                            w++;
                        }
                    }
                }
            }
        }

        return temppart;
    }
    // TODO: implement this class
}
