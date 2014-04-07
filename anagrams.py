import collections

def sort_prehash(word):
	return ''.join(sorted(word))

def count_letters_prehash(word):
	return tuple(collections.Counter(word).items())

def group_anagrams(word, hash_function):
	result = {}
	for w in word:
		s = hash_function(w.lower())
		print s
		if s in result:
			result[s] |= {w}
			#print "|="
			#print result
		else:
			result[s] = {w}
			#print "present"
			#print result

	return result.values()		


print group_anagrams(['tsar', 'rat', 'tar', 'star', 'tars', 'cheese'], count_letters_prehash)			