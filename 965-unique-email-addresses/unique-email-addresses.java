class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            if (parts.length != 2) continue;
            String local = parts[0];
            String domain = parts[1];
            if(local.contains("+")) local = local.substring(0 , local.indexOf("+"));
            local=local.replace(".","");
            String cleanEmail= local+"@"+domain;
            if(!uniqueEmails.contains(cleanEmail))uniqueEmails.add(cleanEmail);
        }
        return uniqueEmails.size();
        
    }
}