int main (int argc, char **argv) {
char *items[] = {"boat", "car", "truck", "train"};
int index = GetUntrustedOffset();
printf("You selected %s\n", items[index-1]);
}

//out of bounds access possible for an attacker with index out of scope