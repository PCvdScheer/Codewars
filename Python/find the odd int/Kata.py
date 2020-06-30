def find_it(seq):
      for i in enumerate(seq):
            if seq.count(i[1]) % 2 != 0:
                return i[1]