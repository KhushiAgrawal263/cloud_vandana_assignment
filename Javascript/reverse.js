// Javascript program to reverse every word of a sentence
const sent = "This is a sunny day"

// Function to reverse a word
function reverseWord(word) {
  return word.split('').reverse().join('');
}

const reversedSent = sent.split(' ').map(word => reverseWord(word)).join(' ');

console.log("Original Sentence: "+sent)
console.log("Reversed Sentence: " + reversedSent);
