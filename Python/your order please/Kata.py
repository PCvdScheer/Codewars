def order(sentence):
  split = sentence.split()
  sen = []
  print(split)
  for j in range(len(split)+1):
    for i in enumerate(split):
        if str(j) in i[1]:
            sen.append(i[1])
  return(' '.join(sen))